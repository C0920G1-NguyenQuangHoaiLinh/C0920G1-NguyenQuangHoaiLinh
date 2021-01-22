package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.model.Customer;
import vn.codegym.repository.CustomerRepository;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Page<Customer> findCustomer(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Customer findById(Integer id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Page<Customer> findName(String name, Pageable pageable) {
        return this.customerRepository.findByCustomerNameContaining(name, pageable);
    }

    @Override
    public Page<Customer> findEmail(String email,Pageable pageable) {
        return customerRepository.findByCustomerEmailContaining(email, pageable);
    }

    @Override
    public Page<Customer> findNameAndEmail(String name, String email,Pageable pageable) {
        return this.customerRepository.findByCustomerNameContainingAndCustomerEmailContaining(name, email, pageable);
    }

}
