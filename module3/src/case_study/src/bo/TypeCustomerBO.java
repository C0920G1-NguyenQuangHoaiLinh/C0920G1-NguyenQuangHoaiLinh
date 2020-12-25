package bo;

import dao.ITypeCustomerDAO;
import dao.TypeCustomerDAO;
import model.CustomerType;

import java.util.List;

public class TypeCustomerBO implements ITypeCustomerBO {
    private ITypeCustomerDAO typeCustomerDAO = new TypeCustomerDAO();

    @Override
    public List<CustomerType> findAllTypeCustomer() {
        return typeCustomerDAO.findAllTypeCustomer();
    }
}
