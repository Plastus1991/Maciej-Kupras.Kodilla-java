package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmplyeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    private final CompanyDao companyDao;
    private final EmplyeeDao emplyeeDao;

    @Autowired
    public Facade(CompanyDao companyDao, EmplyeeDao emplyeeDao) {
        this.companyDao = companyDao;
        this.emplyeeDao = emplyeeDao;
    }

    public void addToList() {
        Employee employee1 = new Employee("Name", "Name");
        Employee employee2 = new Employee("Name1", "Name1");

        Company company = new Company("Company");

        company.getEmployees().add(employee1);
        company.getEmployees().add(employee2);

        employee1.getCompanies().add(company);
        employee2.getCompanies().add(company);

        companyDao.save(company);
    }

    public void deleteAllCompany() {
        companyDao.deleteAll();
    }

    public void deleteAllEmployee() {
        emplyeeDao.deleteAll();
    }

    public int findCompanyByString() {
        List<Company> companies = companyDao.retrieveByAnyString();
        return companies.size();
    }

    public int findEmployeeByString() {
        List<Employee> employees = emplyeeDao.retrieveByAnyString();
        return employees.size();
    }
}
