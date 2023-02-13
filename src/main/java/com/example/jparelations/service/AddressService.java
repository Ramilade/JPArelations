package com.example.jparelations.service;


import com.example.jparelations.entity.Address;
import com.example.jparelations.repository.AddressRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;

    @Transactional
    public void printFullAddressInfo(int id, boolean includeCitizens) {
        Address address_1 = addressRepository.findById(id).get();
        System.out.println(address_1.getStreet());
        if (includeCitizens) {
            System.out.println("Citizens: " + address_1.getCitizens().size());
        }
    }
}

