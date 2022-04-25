package com.example.demo.Controller;

import com.example.demo.Bean.Address;
import com.example.demo.Bean.Department;
import com.example.demo.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    private AddressService addressService;

    // displaying address by id
    @GetMapping("/address/{id}")
    public Address getAddress(@PathVariable int id){
        return addressService.getAddress(id);
    }

    //updating address by id
    @PutMapping("/addressupdate")
    public String updateAddress(@RequestBody Address a){
        addressService.updateAddress(a);
        return "Address successfully updated.";
    }

    // deleting address by id
    @DeleteMapping("addressdeletebyid/{id}")
    public String deleteDepartmentByID(@RequestBody Address a, @PathVariable int id){
        addressService.deleteAddressByID(id);
        return "Address successfully deleted.";
    }
}
