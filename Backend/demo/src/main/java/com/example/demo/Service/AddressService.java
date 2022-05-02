package com.example.demo.Service;

import com.example.demo.AddressRepository;
import com.example.demo.Bean.Address;
import com.example.demo.Bean.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    // fetching address by id
    public Address getAddress(int id){
        return addressRepository.findById(id).get();
    }

    public void addAddress(Address a){
        addressRepository.save(a);
    }

    // updating address by id
    public void updateAddress(Address a){
            addressRepository.save(a);
    }

    // deleting department by id
    public void deleteAddressByID(int id){
        addressRepository.deleteById(id);
    }
}
