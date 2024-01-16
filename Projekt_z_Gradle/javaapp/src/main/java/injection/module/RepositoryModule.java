package injection.module;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import injection.Repository;


/**
 * Created by Adam Seweryn
 */
public class RepositoryModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Repository.class).toProvider(DatabaseProvider.class).in(Singleton.class);
    }
}
