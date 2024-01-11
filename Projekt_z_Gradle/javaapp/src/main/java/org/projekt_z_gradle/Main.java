package org.projekt_z_gradle;

/**
 * Created by Adam Seweryn
 */

public class Main {

    public static void main(String[] args) {
        ExampleModel exampleModel = new ExampleModel();
        exampleModel.setHairColor("Blond");
        exampleModel.setHight(185);
        exampleModel.setMale(false);
        exampleModel.setAge(29);
        System.out.println(exampleModel);
    }
}