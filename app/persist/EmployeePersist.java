package persist;

import io.ebean.DB;
import io.ebean.Database;
import models.Employee;
import models.Phone;

import javax.inject.Inject;
import java.util.*;

public class EmployeePersist {

    private final Database database;


    @Inject
    public EmployeePersist() {
        this.database = DB.getDefault();
    }

    public List<Employee> getAllEmployees() {
        return database.find(Employee.class).findList();
    }

    public Employee findById(int id) {

        return database.find(Employee.class,id);
    }

    public void persist(Employee employee) {

        database.insert(employee);
    }

    public void update(Employee employee) {

        database.update(employee);
    }


    public Optional<List<Employee>> findByKeyword(String query, String searchType) {
        List<Employee> emps;
        Set<Employee> empSet = new HashSet<Employee>();

        if (searchType.equals("email")) {
            emps = database.find(Employee.class).where().like("email", "%" + query + "%").findList();
        }else {
            List<Phone> phones = database.find(Phone.class).where().like("phonenumber", "%" + query + "%").findList();
            for(Phone phone : phones) {
                empSet.add(phone.employee);
            }
            emps = new ArrayList<Employee>(empSet);
        }
        return Optional.of(emps).filter(emplist -> !emplist.isEmpty());
    }
}
