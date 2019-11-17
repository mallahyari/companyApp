package models;

import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "employee", uniqueConstraints = {@UniqueConstraint(columnNames = "email"), @UniqueConstraint(columnNames = "address")})
public class Employee extends Model {

    @Id
    @Constraints.Required
    public int id;

    public String fname;
    public String lname;
    public String email;
    public String address;

    @ManyToOne
//    @JoinColumn(name = "office_id")
    public Office office;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "employee", cascade = CascadeType.ALL)
    public List<Phone> phones;

    @OneToOne
    @JoinColumn(name = "user_id")
    public User user;





    public String toString() {
        return fname + " " + lname + " " + email + " " + address + " office: " + office.toString() + ", Phones:" + phones.toString();
    }

}
