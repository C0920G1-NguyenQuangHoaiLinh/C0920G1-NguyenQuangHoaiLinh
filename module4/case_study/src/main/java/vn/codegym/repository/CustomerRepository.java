package vn.codegym.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.model.Customer;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Page<Customer> findByCustomerNameContaining(String name, Pageable pageable);

    Page<Customer> findByCustomerEmailContaining(String email, Pageable pageable);

    Page<Customer> findByCustomerNameContainingAndCustomerEmailContaining(String name, String email, Pageable pageable);
}
