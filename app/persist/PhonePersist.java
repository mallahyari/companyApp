package persist;

import io.ebean.DB;
import io.ebean.Database;
import models.Phone;

import javax.inject.Inject;
import java.util.List;

public class PhonePersist {

    private final Database database;


    @Inject
    public PhonePersist() {
        this.database = DB.getDefault();
    }


    public void persist(Phone phone) {
        database.insert(phone);
    }

    public void persist(List<Phone> phones) {
//        database.insert(phone);
    }
}
