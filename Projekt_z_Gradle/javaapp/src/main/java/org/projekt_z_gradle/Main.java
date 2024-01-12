package org.projekt_z_gradle;

import com.google.gson.Gson;
import lombok.extern.java.Log;

/**
 * Created by Adam Seweryn
 */
@Log
public class Main {
public static final String json = "{\"hairColor\":\"Blond\",\"height\":185,\"width\":0,\"isMale\":true,\"age\":29}";
    public static void main(String[] args) {
        ExampleModel exampleModel = new ExampleModel("Blond", 185, 0, true, 29);

        System.out.println(exampleModel);
        String json = new Gson().toJson(exampleModel);
        ExampleModel fromJsonExampleModel = new Gson().fromJson(json,ExampleModel.class);

        log.info("Huston, mamy problem!");
        System.out.println(exampleModel.equals(fromJsonExampleModel));

        new Gson();
    }
}