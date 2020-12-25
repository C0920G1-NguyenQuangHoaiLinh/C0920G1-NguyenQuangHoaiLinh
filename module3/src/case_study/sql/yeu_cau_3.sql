SELECT * FROM casestudy.nhanvien;
-- yeu cau 3:
select * from nhanvien
where (year(now()) - year(ngaysinh) <= 50 and year(now()) - year(ngaysinh) >= 18) and (diachi = 'da nang' or diachi = 'quang tri');