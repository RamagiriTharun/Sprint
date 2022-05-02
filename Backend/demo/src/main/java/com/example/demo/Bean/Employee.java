package com.example.demo.Bean;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Employee")
public class Employee{

    @Id
    @SequenceGenerator(name = "user_id_sequence", initialValue = 1000, allocationSize = 1)
    @GeneratedValue(generator = "user_id_sequence", strategy = GenerationType.SEQUENCE)
    @Column(name = "emp_id", nullable = false)
    private int empId;

    @Column(name = "first_name", length = 20)
    private String firstName;

    @Column(name = "last_name", length = 20)
    private String lastName;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "date_of_joining")
    private LocalDate dateOfJoining;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "phone_no", length = 10)
    private String phoneNumber;

    @Column(name = "gender", length = 1)
    private String gender;

    @Column(name = "designation", length = 25)
    private String designation;

    @Column(name = "salary")
    private float salary;

    @ManyToOne
    @JoinColumn(name = "dept_id", foreignKey = @ForeignKey(name = "FK_DEPT_ID"))
    private Department department;

    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
    private Address address;


    public Employee() {
    }

    public Employee(int empId, String firstName, String lastName, LocalDate dateOfBirth, LocalDate dateOfJoining, String email, String phoneNumber, String gender, String designation, float salary, Department department, Address address) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfJoining = dateOfJoining;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.designation = designation;
        this.salary = salary;
        this.department = department;
        this.address = address;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}