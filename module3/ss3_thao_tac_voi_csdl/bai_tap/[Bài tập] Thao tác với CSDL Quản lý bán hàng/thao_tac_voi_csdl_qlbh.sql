use quanlybanhang;

insert into customer(customer_name, customer_age) 
values ('Minh Quan', 10),
		('Ngoc Oanh', 20),
        ('Hong Ha', 50);
select * from customer;

insert into `order`(customer_id, order_date, order_total_price)
values (1, '2006-3-21', null),
		(2, '2006-3-23', null),
        (1, '2006-3-16', null);
select * from `order`;

insert into `product`(product_name, product_price)
value ('May Giat', 3),
		('Tu Lanh', 5),
        ('Dieu Hoa', 7),
        ('Quat', 1),
        ('Bep Dien', 2);
select * from `product`;

insert into order_product
value (1, 1, 3),
		(1, 3, 7),
        (1, 4, 2),
        (2, 1, 1),
        (3, 1, 8),
        (2, 5, 4),
        (2, 3, 3);
select * from order_product;

-- Hiển thị các thông tin gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select order_id, order_date, order_total_price from `order`;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select c.customer_name, p.product_name from customer c
inner join `order` o on c.customer_id = o.customer_id
inner join order_product op on o.order_id = op.order_id
inner join product p on od.product_id = p.product_id;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
-- cách 1:
select customer_name from customer where customer_id not in (select customer_id from `order`);
-- cách 2: tối ưu hơn c1
select * from customer c
left join `order` o on c.customer_id = o.customer_id
where o.order_id is null;

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn
-- (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)
select o.order_id, o.order_date, sum(od.order_product_quantity * p.product_price) as TongTien from `order` o
inner join order_product od on  o.order_id = od.order_id
inner join product p on od.product_id = p.product_id
group by o.order_id;