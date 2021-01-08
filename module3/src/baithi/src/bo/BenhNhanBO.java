package bo;

import dao.BenhNhanDAO;
import model.BenhNhan;

import java.sql.SQLException;
import java.util.List;

public class BenhNhanBO implements IBenhNhanBO{
    BenhNhanDAO benhNhanBO = new BenhNhanDAO();
    @Override
    public List<BenhNhan> showAll() throws SQLException {
        return benhNhanBO.showAll();
    }
}
