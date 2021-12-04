create database QuanLyBanHang;
use QuanLyBanHang;

create table customer (
	customer_id int primary key auto_increment,
    customer_name varchar(50),
    customer_age int
);

create table `order` (
	order_id int primary key auto_increment,
    customer_id int,
    order_date Date,
    order_total_price double,
    foreign key (customer_id) references customer(customer_id)
);

create table product (
	product_id int primary key auto_increment,
    product_name varchar(100),
    product_price double
);

create table order_product (
	order_id int,
	product_id int,
    order_product_quantity int,
    primary key (order_id, product_id),
    foreign key (order_id) references `order`(order_id),
    foreign key (product_id) references product(product_id)
);