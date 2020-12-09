SELECT * FROM casestudy.dichvu;
-- yeu cau 6:
select dichvu.IDDichVu, dichvu.TenDichVu, dichvu.DienTich, dichvu.ChiPhiThue, dichvu.ChiPhiThue, loaidichvu.TenLoaiDichVu
from dichvu
join hopdong on dichvu.IDDichVu = hopdong.IDDichVu
join loaidichvu on dichvu.IDLoaiDichVu = loaidichvu.IDLoaiDichVu
where not exists (select loaidichvu.IDLoaiDichVu from loaidichvu where NgayLamHopDong >= 2019-01-01 and NgayLamHopDong <= 2019-3-31 and loaidichvu.IDLoaiDichVu = dichvu.IDLoaiDichVu)
group by hopdong.IDDichVu;