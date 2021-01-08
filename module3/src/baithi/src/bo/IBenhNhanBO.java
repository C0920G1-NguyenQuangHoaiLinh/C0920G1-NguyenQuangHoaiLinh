package bo;

import model.BenhNhan;

import java.sql.SQLException;
import java.util.List;

public interface IBenhNhanBO {
    List<BenhNhan> showAll() throws SQLException;
}
