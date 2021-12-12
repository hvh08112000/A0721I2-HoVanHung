-- Bước 1: Tạo cơ sở dữ liệu demo
create database demo_view_index_stored_procedure;

use demo_view_index_stored_procedure;

-- Bước 2: Tạo bảng Products với các trường dữ liệu
create table products (
	id int primary key auto_increment,
    product_code varchar(10),
	product_name varchar(45),
	product_price double,
	product_amount int,
	product_description varchar(100),
	product_status varchar(45)
);

insert into products
values (1, "p01", "Quạt", 10, 5, null, "còn hàng"),
		(2, "p02", "Tivi", 30, 3, null, "còn hàng"),
		(3, "p03", "Máy giặt", 20, 5, null, "còn hàng"),
		(4, "p04", "Bàn ủi", 5, 0, null, "hết hàng"),
		(5, "p05", "Điều hòa", 25, 10, null, "còn hàng"),
		(6, "p06", "Điện thoại", 10, 10, null, "còn hàng"),
		(7, "p07", "Laptop", 20, 5, null, "còn hàng"),
		(8, "p08", "Tủ lạnh", 15, 0, null, "hết hàng");
        
-- Bước 3:
-- Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
-- Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)
-- Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào
-- So sánh câu truy vấn trước và sau khi tạo index
create unique index idx_product_name on products(product_code);
explain select * from products where product_code = "p06";

explain select * from products where product_name = "Điều hòa" or product_name = "Tivi";
alter table products add index idx_product_name_price(product_name, product_price);
explain select * from products where product_name = "Điều hòa" or product_name = "Tivi";

-- Bước 4:
-- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products.
create view view_product as
select product_code, product_name, product_price, product_status from products;

select * from view_product;

-- Tiến hành sửa đổi view
update view_product set product_name = "Bếp ga" where product_code = "p08";

select * from products;
-- Tiến hành xoá view
drop view view_product;

-- Bước 5:
-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
DELIMITER //
create procedure sp_all_products()
begin
select * from products;
end //
DELIMITER ;

call sp_all_products();
-- Tạo store procedure thêm một sản phẩm mới
DELIMITER //
create procedure sp_add_products (in code varchar(10), in name varchar(45), in price double, in amount int, in description varchar(100), in status varchar(45))
begin
insert into products(product_code, product_name, product_price, product_amount, product_description, product_status)
value (code, name, price, amount, description, status);
end //
DELIMITER ;

call sp_add_products("p09", "Loa", 10, 3, null, "còn hàng");

select * from products;
-- Tạo store procedure sửa thông tin sản phẩm theo id
DELIMITER //
create procedure sp_update_products (inout id int, in code varchar(10), in name varchar(45), in price double, in amount int, in description varchar(100), in status varchar(45))
begin
update products set product_code = code, product_name = name, product_price = price, product_amount = amount, product_description = description, product_status = status
where product_id = id;
end //
DELIMITER ;

set @id = 6;
call sp_update_products(@id, "p06", "Điện thoại", 10, 0, null, "hết hàng");
select @id;
-- Tạo store procedure xoá sản phẩm theo id
