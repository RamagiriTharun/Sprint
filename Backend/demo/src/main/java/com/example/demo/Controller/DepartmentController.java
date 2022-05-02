package com.example.demo.Controller;

import com.example.demo.Bean.Department;
import com.example.demo.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public List<Department> getAllDepartment(){
        return departmentService.getAllDepartments();
    }

    // displaying department by id
    @GetMapping("/departments/{id}")
    public Department getDepartment(@PathVariable int id){
        return departmentService.getDepartment(id);
    }

    // inserting department
    @PostMapping("/addDepartments")
    public void addDepartment(@RequestBody Department department){
        departmentService.addDepartment(department);
    }

    //updating department by id
    @PutMapping("/departmentsUpdate")
    public void updateDepartment(@RequestBody Department d){
        departmentService.updateDepartment(d);
    }

    // deleting all department
    @DeleteMapping("/departmentsDelete")
    public void deleteAllDepartments(){
        departmentService.deleteAllDepartment();
    }

    // deleting department by id
    @DeleteMapping("departmentsDelete/{id}")
    public void deleteDepartmentByID(@RequestBody Department d, @PathVariable int id){
        departmentService.deleteDepartmentByID(id);
    }

}
