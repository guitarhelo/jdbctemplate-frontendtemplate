package com.pan.jdbctemplate.frontend.service.impl;

import com.pan.jdbctemplate.frontend.dao.EmployeeDAO;
import com.pan.jdbctemplate.frontend.model.Employee;
import com.pan.jdbctemplate.frontend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by panjingping on 7/13/2017.
 */
public class EmplyeeServiceimpl implements EmployeeService{


    @Autowired
    private EmployeeDAO employeeDAO;
    @Override
    public void saveEmployee(Employee employee) {

    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeDAO.getEmployeeById(id);
    }

    @Override
    public void updateEmployee(Employee employee) {

        employeeDAO.updateEmployee(employee);
    }

    @Override
    public void deleteEmployee(int id) {

        employeeDAO.deleteEmployee(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
}
