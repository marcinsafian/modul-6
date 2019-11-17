package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Facade {

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    EmployeesAndCompaniesFacade employeesAndCompaniesFacade;

    @Test
    public void testSearchingCompanyFacade() throws SearchingException{

        //Given
        Company compny1 = new Company("Software Big Data");
        Company compny2 = new Company("Jim Matters");
        Company compny3 = new Company("Grey Matter");

        companyDao.save(compny3);
        companyDao.save(compny2);
        companyDao.save(compny1);

        //When
        List<Company> companyList1 = employeesAndCompaniesFacade.findCompany("Grey");

        //Then
        Assert.assertEquals(1, companyList1.size());

        //CleanUp
        try {
          companyDao.deleteAll();
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testSearchingEmployeeFacade() throws SearchingException {
        //Given
        Employee emp1 = new Employee("Jim","Elo");
        Employee emp2 = new Employee("John", "Kovy");
        Employee emp3 = new Employee("Lin", "Sky");

        employeeDao.save(emp1);
        employeeDao.save(emp2);
        employeeDao.save(emp3);

        //When
        List<Employee> employeeList1 = employeesAndCompaniesFacade.findEmployee("Elo");

        //Then
        Assert.assertEquals(1, employeeList1.size());

        //CleanUp
        try {
            employeeDao.deleteAll();
        } catch (Exception e) {
            //do nothing
        }
    }
}
