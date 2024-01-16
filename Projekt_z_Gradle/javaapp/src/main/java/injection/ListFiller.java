package injection;

import com.google.inject.Inject;

/**
 * Created by Adam Seweryn
 */
public class ListFiller {
    @Inject
    private Repository repository;

    public void getUsers() {
        repository.getUsers();
    }
}
