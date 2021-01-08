package dao;

import model.BenhNhan;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BenhNhanDAO implements IBenhNhanDAO{
    private DatabaseDAO databaseDAO = new DatabaseDAO();
    private static final String SELECT_ALL = "select * from benh_nhan";

    @Override
    public List<BenhNhan> showAll() throws SQLException {
        List<BenhNhan> benhNhanList = new ArrayList<>();
        PreparedStatement preparedStatement = databaseDAO.getConnection().prepareStatement(SELECT_ALL);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            String ma_benh_nhan = resultSet.getString("ma_benh_nhan");
            String ten_benh_nhan = resultSet.getString("ten_benh_nhan");
            String ngay_nhap_vien = resultSet.getString("ngay_nhap_vien");
            String ngay_ra_vien = resultSet.getString("ngay_ra_vien");
            String ly_do_nhap_vien = resultSet.getString("ly_do_nhap_vien");
            benhNhanList.add(new BenhNhan(ma_benh_nhan,ten_benh_nhan,ngay_nhap_vien,ngay_ra_vien,ly_do_nhap_vien));
        }
        return benhNhanList;
    }
}
