drop database if exists casestudy;
create database CaseStudy;
use CaseStudy;
-- drop database CaseStudy;
create table ViTri(IDViTri int primary key,TenViTri varchar(45));
create table TrinhDo(IDTrinhDo int primary key, TrinhDo varchar(45));
create table BoPhan(IDBoPhan int primary key, TenBoPhan varchar(45));

create table NhanVien(IDNhanVien int primary key, `Ho ten` varchar(45),IDViTri int,IDTrinhDo int,IDBoPhan int,NgaySinh date,SoCMND varchar(45),Luong varchar(45)
,SDT varchar(45),Email varchar(45),DiaChi varchar(45),foreign key(IDViTri)references ViTri(IDViTri),foreign key(IDTrinhDo)references TrinhDo(IDTrinhDo)
,foreign key(IDBoPhan)references BoPhan(IDBoPhan));


create table LoaiKhach(IDLoaiKhach int primary key,TenLoaiKhach varchar(45));
create table KhachHang(IDKhachHang int primary key,IDLoaiKhach int,foreign key(IDLoaiKhach)references LoaiKhach(IDLoaiKhach)
,`Ho ten` varchar(45),NgaySinh date,SoCMND varchar(45),SDT varchar(45),Email varchar(45),DiaChi varchar(45));

create table DichVuDiKem(IDDichVuDiKem int primary key,TenDichVuDiKem varchar(45),Gia int,DonVi int,TrangThaiKhaDung varchar(45));
create table KieuThue(IDKieuThue int primary key,TenKieuThue varchar(45),Gia int);
create table LoaiDichVu(IDLoaiDichVu int primary key,TenLoaiDichVu varchar(45));
create table DichVu(IDDichVu int primary key,TenDichVu varchar(45),DienTich int,SoTang int,SoNguoiToiDa varchar(45),ChiPhiThue varchar(45),
IDKieuThue int,foreign key(IDKieuThue)references KieuThue(IDKieuThue),IDLoaiDichVu int,
foreign key(IDLoaiDichVu)references LoaiDichVu(IDLoaiDichVu),TrangThai varchar(45));
create table HopDong(IDHopDong int primary key, IDNhanVien int,foreign key(IDNhanVien)references NhanVien(IDNhanVien),IDKhachHang int,
foreign key (IDKhachHang)references KhachHang(IDKhachHang),IDDichVu int,foreign key(IDDichVu)references DichVu(IDDichVu),NgayLamHopDong date,NgayKetThuc date,
TienDatCoc int,TongTien int);
create table HopDongChiTiet(IDHopDongChiTiet int primary key,IDHopDong int,foreign key(IDHopDong)references HopDong(IDHopDong),IDDichVuDiKem int,
foreign key(IDDichVuDiKem)references DichVuDiKem(IDDichVuDiKem),SoLuong int);


-- yeu cau 2:
insert into vitri
values
(2001,'nv'),
(2002,'nv'),
(2003,'tp'),
(2004,'pp');
insert into trinhdo
values 
(3001,'dh'),
(3002,'dh'),
(3003,'12'),
(3004,'12');
insert into bophan
values 
(4001,'it'),
(4002,'sale'),
(4003,'marketing'),
(4004,'it');
insert into nhanvien
values 
	(1001,'Linh',2001,3001,4001,'2000-1-1','201212','10m','0909 111 222','linh@mail.com','da nang'),
	(1002,'Bao',2002,3002,4002,'1999-2-2','201223','9m','0910 333 444','bao@mail.com','hue'),
	(1003,'Thinh',2003,3003,4003,'1998-3-3','201234','7m','0911 444 555','thinh@mail.com','quang nam'),
	(1004,'Nhan',2004,3004,4004,'1997-4-4','201245','10m','0912 666 777','nhan@mail.com','ha noi');
    
insert into loaikhach
values
(001,'diamond'),
(002,'platium'),
(003,'gold'),
(004,'silver'),
(005,'member');
insert into khachhang
values
(5001,001,'An','2000-11-11','22201','0122 111 111','an@gmail.com','da nang'),
(5002,002,'Binh','2001-12-12','22211','0122 222 222','binh@gmail.com','quang tri'),
(5003,003,'chi','1998-07-10','22201','0122 333 333','chi@gmail.com','hue');
insert into kieuthue
values
(101,'nam',30000),
(102,'thang',3000),
(103,'ngay',100),
(104,'gio',10);
insert into loaidichvu
values
(201,'vip'),
(202,'normal');
insert into dichvu
values
(7001,'villa',100,2,'4','100',102,201,'ok'),
(7002,'house',50,2,'4','80',101,202,'ok');
insert into hopdong
values
(6001,1001,5001,7001,'2020-11-04','2020-12-04',1000,5000),
(6002,1002,5002,7002,'2020-11-04','2020-12-04',500,3000),
(6003,1003,5003,7002,'2020-11-04','2020-12-04',200,1000);
insert into dichvudikem
values
(8001,'masege','00',0,'on'),
(8002,'karaoke','00',0,'on'),
(8003,'food','00',0,'on');
insert into hopdongchitiet
values
(9001,6001,8001,3),
(9002,6002,8002,2),
(9003,6003,8003,1);







