create database CaseStudy;
use CaseStudy;
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