package com.example.demo.Controller;


import com.example.demo.Bean.Employee;
import com.example.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getallemp")
    List<Employee> getAllEmp(){
        List<Employee> employeeList = employeeService.getAllEmp();
        return employeeList;
    }

    @GetMapping("/getempid/{empId}")
    Employee getempbyid(@PathVariable("empId") int empId){
        return employeeService.getEmpById(empId);
    }

    @PostMapping("/addemp")
    Employee addEmp(@RequestBody Employee employee){
        return employeeService.addEmp(employee);
    }

    @PutMapping("/updateemp")
    Employee updateEmp(@RequestBody Employee employee){
        return employeeService.updateEmp(employee);
    }

    @DeleteMapping("/deletebyid/{empId}")
    String deleteEmp(@PathVariable("empId") int empId){
        employeeService.deleteEmpId(empId);
        return "Employee deleted Successfully";
    }

    @DeleteMapping("/deleteallemp")
    String deleteAllEmp(){
        employeeService.deleteAllEmp();
        return "all employee details deleted successfully";
    }
}
