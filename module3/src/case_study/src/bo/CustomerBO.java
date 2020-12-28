package bo;

import common.Validation;
import dao.CustomerDAO;
import model.Customer;

import java.util.List;

public class CustomerBO implements ICustomerBO {

    private CustomerDAO customerDAO = new CustomerDAO();
    @Override
    public String addNewCustomer(Customer customer) {
        String message;
        if(!Validation.regexIDCustomer(customer.getId())){
            message = "Invalid ID ! Format ID is KH-XXXX with X is number from 0 to 9 !";
        } else if (testID(customer.getId())) {
            message = "Invalid ID ! ID is exists ! Please input ID other !";
        } else if (Validation.regexIDCard(customer.getCustomer_id_card())) {
            message = "Invalid ID card ! Format ID Card is XXXXXXXXX or XXXXXXXXXXXX with X is number from 0 to 9 !";
        } else if (Validation.regexPhoneNumber(customer.getCustomer_phone())) {
            message = "Invalid phone number ! Format phone number is 090xxxxxxx or 091xxxxxxx or (84)+90xxxxxxx or " +
                    "(84)+91xxxxxxx with x is number from 0 to 9 !";
        } else if (Validation.regexEmail(customer.getCustomer_email())) {
            message = "Invalid email ! Format email is abc@abc.abc !";
        } else message = this.customerDAO.addNewCustomer(customer);

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
        if(!Validation.regexIDCustomer(customer.getId())){
            message = "Invalid ID ! Format ID is KH-XXXX with X is number from 0 to 9 !";
        } else if (Validation.regexIDCard(customer.getCustomer_id_card())) {
            message = "Invalid ID card ! Format ID Card is XXXXXXXXX or XXXXXXXXXXXX with X is number from 0 to 9 !";
        } else if (Validation.regexPhoneNumber(customer.getCustomer_phone())) {
            message = "Invalid phone number ! Format phone number is 090xxxxxxx or 091xxxxxxx or (84)+90xxxxxxx or " +
                    "(84)+91xxxxxxx with x is number from 0 to 9 !";
        } else if (Validation.regexEmail(customer.getCustomer_email())) {
            message = "Invalid email ! Format email is abc@abc.abc !";
        } else {
            message = customerDAO.editCustomer(id, customer);
        }
        return message;
    }

    @Override
    public List<Customer> searchCustomer(String customer_name) {
        return customerDAO.searchCustomer(customer_name);
    }

    private boolean testID(String id) {
        List<Customer> customerList = findAllCustomer();
        for (Customer customer : customerList) {
            if (customer.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
