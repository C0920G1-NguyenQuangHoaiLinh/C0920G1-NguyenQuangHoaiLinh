package vn.codegym.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.model.Customer;

import java.util.List;

public interface CustomerService {
    Page<Customer> findCustomer(Pageable pageable);

    Customer findById(Integer id);

    void saveCustomer(Customer customer);

    void updateCustomer(Customer customer);

    void deleteCustomer(int id);

    Page<Customer> findName(String name,Pageable pageable);

    Page<Customer> findEmail(String email,Pageable pageable);

    Page<Customer> findNameAndEmail(String name, String email,Pageable pageable);
}
