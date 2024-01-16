package injection;

import lombok.extern.java.Log;

/**
 * Created by Adam Seweryn
 */
@Log
public class Database implements Repository{
    @Override
    public void getUsers() {
log.info("Injected");
    }
}
