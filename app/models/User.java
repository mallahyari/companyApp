package models;

import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;

@Entity
@Table(name = "user", uniqueConstraints = @UniqueConstraint(columnNames = "username"))
public class User extends Model {

    @Id
    @Constraints.Required
    public int id;

    public String fname;
    public String lname;

    public String username;
    public String password;
    public String type;

    @OneToOne(mappedBy = "user")
    public Employee employee;

}
