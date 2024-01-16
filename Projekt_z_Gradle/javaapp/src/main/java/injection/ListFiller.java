package injection;

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
