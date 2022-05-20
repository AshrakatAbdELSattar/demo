package com.example.demo.controller;

import com.example.demo.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class EmployeeController {
    List<Employee> emps = new ArrayList<Employee>();

    @PostMapping("/addEmp")
    public String addEpmloyee(@RequestBody Employee emp) {
        emps.add(emp);
        DepartmentController.countNumOfEmp(emp.getDepId());
        return "Done";
    }

    @GetMapping("/showEmp")
    public List<Employee> listAllEmployee() {
        //emps.add(new Employee(1, "Ali", "Ahmed", 3000.0, 1));
        // emps.add(new Employee(2,"Yassen","Ahmed",3000.0));
        // emps.add(new Employee(3,"Hady","Ahmed",3000.0));

        return emps;
    }
}
