package com.example.demo.Bean;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "Address")
public class Address {

    @Id
    @Column(name = "address_id")
    private Integer addressId;

    @Column(length = 25)
    private String city;

    @Column(length = 25)
    private String state;

    @Column(length = 25)
    private String area;

    @Column(length = 6)
    private String pincode;

    @OneToOne
    @JoinColumn(name = "emp_id", foreignKey = @ForeignKey(name = "FK_Address_EMP_ID"))

    private Employee employee;


    public Address() {
    }

    public Address(Integer addressId, String city, String state, String area, String pincode, Employee employee) {
        this.addressId = addressId;
        this.city = city;
        this.state = state;
        this.area = area;
        this.pincode = pincode;
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
