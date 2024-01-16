package injection.module;


import com.google.inject.Provider;
import injection.Database;

/**
 * Created by Adam Seweryn
 */
public class DatabaseProvider implements Provider<Database> {
    @Override
    public Database get() {
        Database repository = new Database();
        repository.setHost("localhost");
        return repository;
    }
}
