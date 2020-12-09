SELECT * FROM casestudy.nhanvien;
-- yeu cau 2:
select * from nhanvien
where (`ho ten` like 'H%' or `ho ten` like 'T%' or `ho ten` like 'K%') and length(nhanvien.`ho ten`) <= 15;
