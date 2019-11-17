package models;

import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;

@Entity
@Table(name = "phone")
public class Phone extends Model {


    @Id
    @Constraints.Required
    public int id;

//    @Column(name = "empid")
//    public int empid;

    public String phonenumber;

    @ManyToOne
    @JoinColumn(name = "empid", referencedColumnName = "id")
    public Employee employee;


    public String toString() {
        return "emp phone:" + employee.toString() + "  ==> number: " +  phonenumber + "\n";
    }

}
