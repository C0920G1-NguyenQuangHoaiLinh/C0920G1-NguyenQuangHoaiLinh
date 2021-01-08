package bo;

import dao.BenhAnDAO;
import model.BenhAn;

import java.sql.SQLException;
import java.util.List;

public class BenhAnBO implements IBenhAnBO{
    private BenhAnDAO benhAnDAO = new BenhAnDAO();
    @Override
    public List<BenhAn> findAll() throws SQLException {
        return benhAnDAO.findAll();
    }

    @Override
    public List<BenhAn> find(String ma_benh_an, BenhAn benhAn) throws SQLException {
        return benhAnDAO.find(ma_benh_an, benhAn);
    }

    @Override
    public String edit(String ma_benh_an, BenhAn benhAn) throws SQLException {
        return benhAnDAO.edit(ma_benh_an, benhAn);
    }
}
