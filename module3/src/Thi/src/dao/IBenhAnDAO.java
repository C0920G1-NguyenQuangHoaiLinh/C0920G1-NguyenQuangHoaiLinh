package dao;

import model.BenhAn;

import java.sql.SQLException;
import java.util.List;

public interface IBenhAnDAO {
    List<BenhAn> findALL() throws SQLException;

    List<BenhAn> find(String ma_benh_an, BenhAn benhAn) throws SQLException;

    String edit(String ma_benh_an, BenhAn benhAn) throws SQLException;
}
