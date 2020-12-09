create database bt5_view_index_store_procedure;
use bt5_view_index_store_procedure;
create table products(
id int primary key, product_code int, product_name varchar(45),product_price int, product_amount int,product_description varchar(45),
product_status varchar(45));
insert into products
values 
	(1,101,'ipx',1000,10,'dt','con'),
	(2,102,'note10',700,5,'dt','con'),
	(3,103,'vertu',30000,0,'dt','het');

-- 
alter table products
add unique product_code (product_code);

alter table products add index compile_index(product_name,product_price);
explain select * from products;

-- them view :
create view products_view as
select product_code, product_name, product_price, product_status
from products;
select * from products_view;

-- cap nhat lai view
create or replace view products_view as
select product_code, product_name, product_price, product_status
from products
where id = 1;
select * from products_view;

-- xoa view
drop view products_view;

-- tao store procedure :
DELIMITER //

CREATE PROCEDURE show_products()

BEGIN

  SELECT * FROM products;

END //
DELIMITER ;
call show_products();

-- Tạo store procedure thêm một sản phẩm mới :
delimiter //
create procedure add_new_products(in id int,in product_code int,in product_name varchar(45),in product_price int,in product_amount int,
in product_description varchar(45),in product_status varchar(45))
begin
    insert into products values (id,product_code,product_name,product_price,product_amount, product_description, product_status);
end //
delimiter ;
call add_new_products(4,104,'sony',150,20,'dt','con');

-- Tạo store procedure sửa thông tin sản phẩm theo id :
delimiter //
create procedure update_products_by_id(in id1 int,in product_code1 int,in product_name1 varchar(45),in product_price1 int,in product_amount1 int,
in product_description1 varchar(45),in product_status1 varchar(45))
begin
	update products
    set product_code = product_code1, product_name = product_name1, product_price = product_price1, product_amount = product_amount1,
    product_description = product_description1, product_status = product_status1 
    where id = id1 ;
end //
delimiter ;
call update_products_by_id(3,103,'oppo',150,30,'dt','con') ;

-- Tạo store procedure xoá sản phẩm theo id
delimiter //
create procedure delete_products_by_id(in id2 int)
begin
	delete from products
    where id = id2 ;
end //
delimiter ;
call delete_products_by_id(4) ;

-- drop procedure delete_products_by_id;