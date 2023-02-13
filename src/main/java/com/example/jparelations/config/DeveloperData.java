package com.example.jparelations.config;

import com.example.jparelations.entity.Address;
import com.example.jparelations.entity.Citizen;
import com.example.jparelations.service.AddressService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.example.jparelations.repository.AddressRepository;
import com.example.jparelations.repository.CitizenRepository;
import com.example.jparelations.repository.TownRepository;

import java.io.IOException;

@Component
public class DeveloperData implements ApplicationRunner {

    TownRepository townRepository;
    AddressRepository addressRepository;
    CitizenRepository citizenRepository;
    AddressService addressService;


    public DeveloperData(TownRepository townRepository, AddressRepository addressRepository, CitizenRepository citizenRepository, AddressService addressService) {
        this.townRepository = townRepository;
        this.addressRepository = addressRepository;
        this.citizenRepository = citizenRepository;
        this.addressService = addressService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        step6();



    }

    public void step6() throws IOException {

        System.out.println("*********Step 6*********");

        Address a1 = new Address("Lyngbyvej 1", "Lyngby", "2800");
        Citizen citizen1 =  Citizen.builder().firstName("Kurt").lastName("Wonnegut").build();
        Citizen citizen2 =  Citizen.builder().firstName("Børge").lastName("Wonnegut").build();
        Citizen citizen3 =  Citizen.builder().firstName("Hanne").lastName("Wonnegut").build();


        a1.addCitizen(citizen1);
        a1.addCitizen(citizen2);
        a1.addCitizen(citizen3);

        addressRepository.save(a1);



        System.out.println("------- Select statements starts here ------------");
        addressService.printFullAddressInfo(1, true);



    }
}
