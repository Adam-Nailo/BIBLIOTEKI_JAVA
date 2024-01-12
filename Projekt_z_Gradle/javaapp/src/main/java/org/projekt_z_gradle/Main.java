package org.projekt_z_gradle;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.extern.java.Log;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Adam Seweryn
 */
@Log
public class Main {
    public static final String json = "{\"hairColor\":\"Blond\",\"height\":185,\"width\":0,\"isMale\":true,\"age\":29}";
    private static Gson gson= new Gson();
    private static List<ExampleModel> listOld;

    public static void main(String[] args) {
        List<Cloth> clothList = Arrays.asList(new Cloth("Green",true),new Cloth("Red",false));
        ExampleModel exampleModel1 = ExampleModel.builder()
                .cloth(clothList)
                .hairColor("Blond")
                .height(185)
                .width(0)
                .isMale(true)
                .age(29)
                .build();
        ExampleModel exampleModel2 = ExampleModel.builder()
                .cloth(clothList)
                .hairColor("Blond2")
                .height(1852)
                .width(2)
                .isMale(true)
                .age(292)
                .build();


        listOld = Arrays.asList(exampleModel1, exampleModel2);
        String json = gson.toJson(listOld);
        List<ExampleModel> newList = gson.fromJson(json, new TypeToken<List<ExampleModel>>(){}.getType());

        log.info(json);
        System.out.println(listOld.equals(newList));

        new Gson();
    }
}