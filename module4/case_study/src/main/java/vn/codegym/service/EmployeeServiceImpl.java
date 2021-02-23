package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import vn.codegym.model.Employee;
import vn.codegym.model.User;
import vn.codegym.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    UserDetailsServiceImpl userDetailsService;

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public Page<Employee> findByNameContaining(Pageable pageable, String name) {
        return employeeRepository.findByNameContaining(pageable,name);
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public boolean testRole(User user, Long id) {
        Employee employee = new Employee();
        List<Employee> employeeList = employeeRepository.findAll();
        for (Employee value : employeeList){
            if (value.getName().equals(user.getUserName())){
                employee = value;
            }
        }
        return (employee.getPosition().getName().equals("Receptionist") || employee.getPosition().getName().equals("Server")
        ||employee.getPosition().getName().equals("Expert")||employee.getPosition().getName().equals("Monitoring")
        ||employee.getPosition().getName().equals("Manager")||employee.getPosition().getName().equals("Director")) && id == 1;
    }

    @Override
    public String saveUser(User user, Long id, String verification) {
        if (verification.equals("ok".concat(user.getPassword()))){
            user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));
//            user.setId((long) (Math.random() * 100));
            user.setEnabled(true);
            this.userDetailsService.saveNewUser(user);
            this.userDetailsService.saveUserRole(user, id);
            return "Register success !";
        }else {
            return "Your Verification Code is wrong !";
        }
    }
}
