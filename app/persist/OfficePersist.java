package persist;

import io.ebean.DB;
import io.ebean.Database;
import models.Office;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OfficePersist {


    private final Database database;


    @Inject
    public OfficePersist() {
        this.database = DB.getDefault();
    }


    public Map<String, String> getAllOffices() {
        Map<String, String> offices = new HashMap<String,String>();
        List<Office> officeList = database.find(Office.class).findList();
        for(Office office : officeList) {
            offices.put(String.valueOf(office.id), office.officename);
        }
        return offices;
    }

}
