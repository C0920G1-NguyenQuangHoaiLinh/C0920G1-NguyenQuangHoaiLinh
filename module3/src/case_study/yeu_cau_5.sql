SELECT * FROM casestudy.khachhang;
-- yeu cau 5:
select khachhang.IDKhachHang, khachhang.`Ho ten`,loaikhach.TenLoaiKhach, hopdong.IDHopDong, dichvu.TenDichVu, hopdong.NgayLamHopDong,
hopdong.NgayKetThuc, hopdong.TongTien
from hopdong 
join khachhang on hopdong.IDKhachHang = khachhang.IDKhachHang
join loaikhach on khachhang.IDLoaiKhach = loaikhach.IDLoaiKhach
join dichvu on hopdong.IDDichVu = dichvu.IDDichVu
