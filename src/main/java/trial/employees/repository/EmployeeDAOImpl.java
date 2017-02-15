package trial.employees.repository;

import trial.employees.DTO.Employee;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by vel on 14/02/17.
 */
public class EmployeeDAOImpl implements EmployeeDAO{
    private DataSource dataSource;

    public EmployeeDAOImpl(DataSource dataSource){
        this.dataSource=dataSource;
    }

    public Employee getEmployee(int empno) {
        String sql="SELECT  * FROM EMPLOYEES where id = ?";
        ArrayList<String> column= new ArrayList<String>();
        Connection conn=null;
        Employee employee=null;
        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,empno);
            ResultSet resultSet = ps.executeQuery();

            if(resultSet.next()){
                int i=1;
                employee.setEmpNo(resultSet.getInt(i++));
                employee.setBirthDate(resultSet.getDate(i++));
                employee.setFirstName(resultSet.getString(i++));
                employee.setLastName(resultSet.getString(i++));
                employee.setGender(resultSet.getString(i++));
                employee.setHireDate(resultSet.getDate(i++));
            }
        }catch (SQLException e){
            e.getStackTrace();
            throw new RuntimeException(e);
        }
        return employee;

    }

}
