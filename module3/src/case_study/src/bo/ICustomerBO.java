package bo;

import model.Customer;

import java.util.List;

public interface ICustomerBO {
    //Thêm mới khách hàng
    String addNewCustomer(Customer customer);

    //liệt kê danh sách tất cả khách hàng
    List<Customer> findAllCustomer();

    ///xóa sửa khách hàng
    String deleteCustomer(String id);
    String editCustomer(String id, Customer customer);

    //tìm kiếm theo tên khách hàng
    List<Customer> searchCustomer(String customer_name);
}
