package org.projekt_z_gradle;

import com.google.inject.Guice;
import com.google.inject.Injector;
import injection.ListFiller;
import injection.RepositoryModule;
import lombok.extern.java.Log;

/**
 * Created by Adam Seweryn
 */
@Log
public class Main {
    public static void main(String[] args) throws Exception {
        Injector injector = Guice.createInjector(new RepositoryModule());

        injector.getInstance(ListFiller.class).getUsers();

    }
}