package manager.manageremployee.controller;

import manager.manageremployee.entity.Employees;
import manager.manageremployee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/employees")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;
    @RequestMapping(method = RequestMethod.POST)
    public Employees createEmployee(@RequestBody Employees employee){
        return employeeRepository.save(employee);
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Employees> findAllEmployees(){
        return employeeRepository.findAll();
    }

}
