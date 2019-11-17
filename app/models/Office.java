package models;

import io.ebean.Model;
import org.checkerframework.common.aliasing.qual.Unique;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "office", uniqueConstraints = @UniqueConstraint(columnNames = "officename"))
public class Office extends Model {

    @Id
    @Constraints.Required
    public int id;

    public String officename;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
    private List<Employee> employeeList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
    public List<OfficeLocation> locations;


    public String toString() {
        return id + " " + officename;
    }


}
