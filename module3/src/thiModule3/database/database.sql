drop database if exists kham_benh;
create database kham_benh;
use kham_benh;

create table benh_nhan(
ma_benh_nhan char(10) primary key,
ten_benh_nhan varchar(99),
ngay_nhap_vien varchar(10),
ngay_ra_vien varchar(10),
ly_do_nhap_vien varchar(255)
);

create table benh_an(
ma_benh_an char(10) primary key,
ma_benh_nhan char(10),
foreign key(ma_benh_nhan) references benh_nhan(ma_benh_nhan)
);

insert into benh_nhan
values
("BN-435","Nguyen Van A","07-08-2016","08-08-2016","ung thu"),
("BN-123","Nguyen Van C","10-08-2019","10-08-2016","suy than"),
("BN-984","Ton Nu D","11-01-2020","08-08-2020","covid");

insert into benh_an
values
("BA-001","BN-435"),
("BA-112","BN-123"),
("BA-223","BN-984");

