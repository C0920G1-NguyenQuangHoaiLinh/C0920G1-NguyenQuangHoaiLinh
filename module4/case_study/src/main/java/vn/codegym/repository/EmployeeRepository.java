package vn.codegym.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Page<Employee> findByNameContaining(Pageable pageable, String name);
}
