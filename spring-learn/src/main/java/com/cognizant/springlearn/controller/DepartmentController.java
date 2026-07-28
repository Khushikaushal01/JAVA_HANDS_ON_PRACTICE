package com.cognizant.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.springlearn.model.Department;
import com.cognizant.springlearn.service.DepartmentService;
import java.util.ArrayList;

@RestController
public class DepartmentController {

    private static final Logger logger = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public ArrayList<Department> getAllDepartments() {
        logger.info("Executing getAllDepartments() REST service");
        return departmentService.getAllDepartments();
    }
}
