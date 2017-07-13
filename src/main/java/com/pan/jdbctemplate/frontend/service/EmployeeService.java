package com.pan.jdbctemplate.frontend.service;

/**
 * Created by panjingping on 7/13/2017.
 */
import com.pan.jdbctemplate.frontend.model.Employee;

import java.util.List;
public interface EmployeeService
{
    public void saveEmployee(Employee employee);
    public Employee getEmployeeById(int id);
    public void updateEmployee(Employee employee);
    public void deleteEmployee(int id);
    public List<Employee> getAllEmployees();
}