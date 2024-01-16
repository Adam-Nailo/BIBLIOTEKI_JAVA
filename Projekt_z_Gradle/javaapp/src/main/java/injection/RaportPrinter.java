package injection;

import jakarta.inject.Inject;

/**
 * Created by Adam Seweryn
 */
public class RaportPrinter {
    @Inject
    private Repository repository;

    public void getUsers(){
        repository.getUsers();
    }
}
