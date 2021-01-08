package dao;

import model.BenhAn;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BenhAnDAO implements IBenhAnDAO{
    DatabaseDAO databaseDAO = new DatabaseDAO();

    private static final String SELECT_ALL_BENH_AN = "select * from benh_an";
    private static final String UPDATE_BENH_AN = "update benh_an set ma_benh_an = ?, ma_benh_nhan = ?";
    private static final String SELECT_BY_ID = "select * from benh_an where ma_benh_an = ?";

    public BenhAnDAO() {
    }

    @Override
    public List<BenhAn> findALL() throws SQLException {
        List<BenhAn> benhAnList = new ArrayList<>();
        PreparedStatement preparedStatement = databaseDAO.getConnection().prepareStatement(SELECT_ALL_BENH_AN);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            String ma_benh_an = resultSet.getString("ma_benh_an");
            String ma_benh_nhan = resultSet.getString("ma_benh_nhan");

            benhAnList.add(new BenhAn(ma_benh_an,ma_benh_nhan));
        }
        return benhAnList;
    }

    @Override
    public List<BenhAn> find(String id, BenhAn benhAn) throws SQLException {
        List<BenhAn> benhAnList = new ArrayList<>();
        PreparedStatement preparedStatement = databaseDAO.getConnection().prepareStatement(SELECT_BY_ID);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            String ma_benh_an = resultSet.getString("ma_benh_an");
            String ma_benh_nhan = resultSet.getString("ma_benh_nhan");

            benhAnList.add(new BenhAn(ma_benh_an,ma_benh_nhan));
        }
        return benhAnList;
    }

    @Override
    public String edit(String ma_benh_an, BenhAn benhAn) throws SQLException {
        PreparedStatement preparedStatement = databaseDAO.getConnection().prepareStatement(UPDATE_BENH_AN);
        preparedStatement.setString(1,benhAn.getMa_benh_an());
        preparedStatement.setString(2,benhAn.getMa_benh_nhan());
        preparedStatement.executeUpdate();
        return "Edit successfully";
    }
}
