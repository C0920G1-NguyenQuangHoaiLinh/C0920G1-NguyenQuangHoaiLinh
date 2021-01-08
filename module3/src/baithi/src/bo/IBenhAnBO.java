package bo;

import model.BenhAn;

import java.sql.SQLException;
import java.util.List;

public interface IBenhAnBO {
    List<BenhAn> findAll() throws SQLException;

    List<BenhAn> find(String ma_benh_an, BenhAn benhAn) throws SQLException;

    String edit(String ma_benh_an, BenhAn benhAn) throws SQLException;
}
