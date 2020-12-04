create database bt_khoa_chinh_va_khoa_phu;
use bt_khoa_chinh_va_khoa_phu;
create table Customers 
(customer_number int primary key auto_increment, fullname varchar(255),address varchar(255),email char(55) unique,phone int(10)unique);
create table Accounts (account_number int primary key,customer int, account_type char(55),date date,balance float);
create table Transactions (tran_number int primary key,account_number int, dateTran date, amounts float, descriptions varchar(255));