package com.example.demo.Bean;

import javax.persistence.*;

@Entity
@Table(name = "Department")
public class Department {
    @Id
    @SequenceGenerator(name = "dept_id_sequence", initialValue = 100, allocationSize = 1)
    @GeneratedValue(generator = "dept_id_sequence", strategy = GenerationType.SEQUENCE)
    @Column(name = "dept_id", length = 6)
    private Integer departmentId;

    @Column(name = "dept_name", length = 25)
    private String departmentName;

    public Department() {
    }

    public Department(Integer departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
