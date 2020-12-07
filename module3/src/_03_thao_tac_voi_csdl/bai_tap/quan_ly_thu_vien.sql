create database bt_quan_ly_thu_vien;
use bt_quan_ly_thu_vien;
-- drop database bt_quan_ly_thu_vien;
create table ImageBook(id_image int primary key,type_image varchar(45),properties varchar(45));
create table Book(id_book int primary key,name_book varchar(45),publishing varchar(45),producer varchar(45),year date, publications int,price int,id_image int,
foreign key(id_image)references ImageBook(id_image)
);
create table Category(name_category varchar(45) primary key, id_book int,foreign key(id_book)references Book(id_book));

create table ImageStudent(id_imagestudent int primary key,type_image2 varchar(45),properties2 varchar(45));
create table Student(id_student varchar(15) primary key,name_student varchar(45),address varchar(255),email varchar(45),id_imagestudent int,
foreign key(id_imagestudent)references ImageStudent(id_imagestudent)
);
create table BorrowOrder(id_borrow int primary key,id_book int,id_student varchar(45),start_borrow date,end_borrow date,
foreign key(id_book)references Book(id_book),foreign key(id_student)references Student(id_student)
);

create table CheckBorrow(id_check int primary key,id_borrow int,
foreign key(id_borrow)references BorrowOrder(id_borrow)
);
