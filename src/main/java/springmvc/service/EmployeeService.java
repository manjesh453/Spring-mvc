package springmvc.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import springmvc.entity.Employee;

import java.util.List;

@ComponentScan
@Service
public interface EmployeeService {
    public void addEmployee(Employee employee);

    public List<Employee> getAllEmployees();

    public void deleteEmployee(Integer employeeId);

    public Employee getEmployee(int employeeid);

    public Employee updateEmployee(Employee employee);
}
