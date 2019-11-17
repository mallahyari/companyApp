package persist;

import io.ebean.DB;
import io.ebean.Database;
import models.User;

import javax.inject.Inject;
import java.util.Optional;

public class UserPersist {

    private final Database database;


    @Inject
    public UserPersist() {
        this.database = DB.getDefault();
    }

    public Optional<User> getUser(String username, String password) {
        return database.find(User.class).where().eq("username", username).and().eq("password", password).findOneOrEmpty();
    }

}
