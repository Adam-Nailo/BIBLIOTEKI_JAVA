package org.projekt_z_gradle;

import com.google.gson.Gson;
import lombok.extern.java.Log;

/**
 * Created by Adam Seweryn
 */
@Log
public class Main {

    public static void main(String[] args) {
        ExampleModel exampleModel = new ExampleModel("Blond", 185, 0, true, 29);

        System.out.println(exampleModel);

        ExampleModel exampleModelDuplicate = ExampleModel.builder()
                .age(29)
                .hairColor("Blond")
                .height(185)
                .isMale(true)
                .build();

        System.out.println(exampleModelDuplicate);

        log.info("Huston, mamy problem!");
        System.out.println(exampleModel.equals(exampleModelDuplicate));

        new Gson();
    }
}