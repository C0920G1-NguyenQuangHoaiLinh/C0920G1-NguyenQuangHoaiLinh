package dao;

import model.BenhNhan;

import java.sql.SQLException;
import java.util.List;

public interface IBenhNhanDAO {
    List<BenhNhan> showAll() throws SQLException;
}
