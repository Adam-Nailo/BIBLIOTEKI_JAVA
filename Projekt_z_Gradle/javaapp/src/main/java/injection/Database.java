package injection;

import lombok.Setter;
import lombok.extern.java.Log;

/**
 * Created by Adam Seweryn
 */
@Setter
@Log
public class Database implements Repository {
    private String host;

    @Override
    public void getUsers() {
        log.info(host);
        log.info(toString());
    }
}
