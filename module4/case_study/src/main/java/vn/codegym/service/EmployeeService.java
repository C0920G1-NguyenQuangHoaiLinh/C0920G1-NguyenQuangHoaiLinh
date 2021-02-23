package vn.codegym.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.model.Employee;
import vn.codegym.model.User;

public interface EmployeeService {
    Page<Employee> findAll(Pageable pageable);

    Page<Employee> findByNameContaining(Pageable pageable, String name);

    void saveEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployee(Employee employee);

    boolean testRole(User user, Long id);

    String saveUser(User user, Long id, String verification);
}
