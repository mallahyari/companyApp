package models;

import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;


@Entity
@Table(name = "location")
public class OfficeLocation extends Model {

    @Id
    @Constraints.Required
    public int id;

    public String loc;

    @ManyToOne
    @JoinColumn(name = "office_id", referencedColumnName = "id")
    public Office office;

}
