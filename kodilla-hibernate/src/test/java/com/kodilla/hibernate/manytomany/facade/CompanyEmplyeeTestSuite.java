package com.kodilla.hibernate.manytomany.facade;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CompanyEmplyeeTestSuite {

    @Autowired
    private Facade facade;

    @Test
    void testCompany() {
        //Given
        //When

        facade.addToList();

        //Then
        assertEquals(1, facade.findCompanyByString());
        //delete
        facade.deleteAllCompany();
    }

    @Test
    void testEmployee() {
        //Given
        //When
        facade.addToList();

        //Then
        assertEquals(2, facade.findEmployeeByString());

        //delete
        facade.deleteAllEmployee();
    }
}
