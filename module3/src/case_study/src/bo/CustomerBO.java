package bo;

import dao.CustomerDAO;
import model.Customer;

import java.util.List;

public class CustomerBO implements ICustomerBO {

    private CustomerDAO customerDAO = new CustomerDAO();
    @Override
    public String addNewCustomer(Customer customer) {
        String message = customerDAO.addNewCustomer(customer);
        return message;
    }

    @Override
    public List<Customer> findAllCustomer() {
        return customerDAO.findAllCustomer();
    }

    @Override
    public String deleteCustomer(String id) {
        return customerDAO.deleteCustomer(id);
    }

    @Override
    public String editCustomer(String id, Customer customer) {
        String message ;
        if (customer.getCustomer_name().equals("") ) {
            message = "Please input name !";
        } else {
            message = customerDAO.editCustomer(id, customer);
        }
        return message;
    }

    @Override
    public List<Customer> searchCustomer(String customer_name) {
        return customerDAO.searchCustomer(customer_name);
    }
}
