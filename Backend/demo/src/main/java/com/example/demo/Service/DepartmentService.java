package com.example.demo.Service;

import com.example.demo.Bean.Department;
import com.example.demo.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    // fetching all department
    public List<Department> getAllDepartments(){
        List<Department> depts = (List<Department>)departmentRepository.findAll();
        return depts;
    }

    // fetching department by id
    public Department getDepartment(int id){
        return departmentRepository.findById(id).get();
    }

    // inserting department
    public void addDepartment(Department d) {
        departmentRepository.save(d);
    }

    // updating department by id
    public void updateDepartment(Department d){
            departmentRepository.save(d);
    }

    // deleting all departments
    public void deleteAllDepartment(){
        departmentRepository.deleteAll();
    }

    // deleting department by id
    public void deleteDepartmentByID(int id){
        departmentRepository.deleteById(id);
    }
}
