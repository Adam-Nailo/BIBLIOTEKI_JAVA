package org.projekt_z_gradle;

import com.google.gson.Gson;
import lombok.extern.java.Log;

/**
 * Created by Adam Seweryn
 */
@Log
public class Main {
    public static final String json = "{\"hairColor\":\"Blond\",\"height\":185,\"width\":0,\"isMale\":true,\"age\":29}";
    private static Gson gson= new Gson();

    public static void main(String[] args) {
        ExampleModel exampleModel = ExampleModel.builder()
                .cloth(new Cloth("Green", true))
                .hairColor("Blond")
                .height(185)
                .width(0)
                .isMale(true)
                .age(29)
                .build();

        System.out.println(exampleModel);
        String json = gson.toJson(exampleModel);
        ExampleModel fromJsonExampleModel = gson.fromJson(json, ExampleModel.class);

        log.info("Huston, mamy problem!");
        System.out.println(exampleModel.equals(fromJsonExampleModel));

        new Gson();
    }
}