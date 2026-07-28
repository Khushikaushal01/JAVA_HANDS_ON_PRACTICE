package com.cognizant.springlearn.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.cognizant.springlearn.model.Department;
import java.util.ArrayList;

@Component
public class DepartmentDao {
    public static ArrayList<Department> DEPARTMENT_LIST;

    @Autowired
    public DepartmentDao(ArrayList<Department> departmentList) {
        DEPARTMENT_LIST = departmentList;
    }

    public ArrayList<Department> getAllDepartments() {
        return DEPARTMENT_LIST;
    }
}
