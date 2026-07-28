package com.cognizant.springlearn.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.cognizant.springlearn.model.Employee;
import java.util.ArrayList;

@Component
public class EmployeeDao {
    public static ArrayList<Employee> EMPLOYEE_LIST;

    @Autowired
    public EmployeeDao(ArrayList<Employee> employeeList) {
        EMPLOYEE_LIST = employeeList;
    }

    public ArrayList<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }
}
