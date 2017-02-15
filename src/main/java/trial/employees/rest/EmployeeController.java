package trial.employees.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import trial.employees.DTO.Employee;
import trial.employees.service.EmployeeService;

/**
 * Created by vel on 14/02/17.
 */

@Controller
@RequestMapping(value="employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }

    @RequestMapping(value="/{empNo}",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee getEmployee(@PathVariable("empNo") int empNo){
        Employee employee = employeeService.getEmployee(empNo);
        return employee;
    }
}
