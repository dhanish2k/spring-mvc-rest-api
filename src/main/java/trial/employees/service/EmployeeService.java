package trial.employees.service;

import org.springframework.stereotype.Service;
import trial.employees.DTO.Employee;
import trial.employees.repository.EmployeeDAO;
import trial.employees.repository.EmployeeDAOImpl;

/**
 * Created by vel on 14/02/17.
 */
@Service
public class EmployeeService {

    EmployeeDAOImpl employeeDAO;

    public EmployeeService(EmployeeDAOImpl employeeDAO){
        this.employeeDAO = employeeDAO;
    }


    public Employee getEmployee(int empNo){
        Employee employee=employeeDAO.getEmployee(empNo);
        return employee;
    }

}
