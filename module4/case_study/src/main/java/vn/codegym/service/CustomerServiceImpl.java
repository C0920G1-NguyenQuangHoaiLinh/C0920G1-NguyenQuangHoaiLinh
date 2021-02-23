package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.model.Customer;
import vn.codegym.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Page<Customer> findCustomer(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Customer findById(String id) {
        return customerRepository.findById(id);
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
    public void deleteCustomer(String id) {
        customerRepository.deleteById(id);
    }

    @Override
    public void deleteByName(String name) {
        customerRepository.deleteByCustomerName(name);
    }

    @Override
    public void deleteByCustomer(Customer customer) {
        customerRepository.delete(customer);
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
