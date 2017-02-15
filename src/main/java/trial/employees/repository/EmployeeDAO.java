package trial.employees.repository;

import trial.employees.DTO.Employee;

import javax.sql.DataSource;

/**
 * Created by vel on 14/02/17.
 */
public interface EmployeeDAO {

    Employee getEmployee(int empno);

}
