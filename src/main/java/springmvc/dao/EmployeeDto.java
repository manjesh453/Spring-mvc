package springmvc.dao;

import springmvc.entity.Employee;

import java.util.List;

public interface EmployeeDto {
    public void addEmployee(Employee employee);

    public List<Employee> getAllEmployees();

    public void deleteEmployee(Integer employeeId);

    public Employee updateEmployee(Employee employee);

    public Employee getEmployee(int employeeid);
}
