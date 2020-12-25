package dao;

import model.Customer;

import java.util.List;

public interface ICustomerDAO {
    //Thêm mới khách hàng
    String addNewCustomer(Customer customer);

    //liệt kê danh sách tất cả khách hàng
    public List<Customer> findAllCustomer();

    ///xóa sửa khách hàng
    public String deleteCustomer(String id);
    public String editCustomer(String id, Customer customer);

    //tìm kiếm theo tên khách hàng
    List<Customer> searchCustomer(String customer_name);
}
