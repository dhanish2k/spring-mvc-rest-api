package trial.employees.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created by vel on 14/02/17.
 */


@Setter
@Getter
@AllArgsConstructor
public class Employee implements Serializable {



    private int empNo;

    private Date birthDate;

    private String firstName;

    private String lastName;

    private String gender;

    private Date hireDate;


}
