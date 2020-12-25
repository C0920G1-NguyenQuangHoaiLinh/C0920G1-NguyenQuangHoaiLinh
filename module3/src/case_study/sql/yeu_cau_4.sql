SELECT * FROM casestudy.khachhang;
-- yeu cau 4:
select khachhang.`Ho ten` ,loaikhach.TenLoaiKhach, count(hopdong.IDKhachHang) as 'so lan'
from khachhang join hopdong on khachhang.IDKhachHang = hopdong.IDKhachHang
join loaikhach on khachhang.IDLoaiKhach = loaikhach.IDLoaiKhach
where TenLoaiKhach = 'diamond' group by khachhang.`Ho ten`;