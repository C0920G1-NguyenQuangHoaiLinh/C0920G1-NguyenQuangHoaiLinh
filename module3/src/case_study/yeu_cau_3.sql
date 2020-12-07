SELECT * FROM casestudy.nhanvien;
-- yeu cau 3:
select * from nhanvien
where (ngaysinh >= '1970-01-01' and ngaysinh <= '2002-01-01') and (diachi = 'da nang' or diachi = 'quang tri');