package vn.codegym.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Page<Customer> findByCustomerNameContaining(String name, Pageable pageable);

    Page<Customer> findByCustomerEmailContaining(String email, Pageable pageable);

    Page<Customer> findByCustomerNameContainingAndCustomerEmailContaining(String name, String email, Pageable pageable);

    Customer findById(String id);

    void deleteById(String id);

    void deleteByCustomerName(String name);
}
