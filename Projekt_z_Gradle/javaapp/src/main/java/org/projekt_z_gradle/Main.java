package org.projekt_z_gradle;

/**
 * Created by Adam Seweryn
 */

public class Main {

    public static void main(String[] args) {
        ExampleModel exampleModel = new ExampleModel("Blond", 185, 0, true, 29);

        System.out.println(exampleModel);
        ExampleModel exampleModelDuplicate = new ExampleModel();
        exampleModelDuplicate.setHairColor("Blond");
        exampleModelDuplicate.setHight(185);
        exampleModelDuplicate.setMale(true);
        exampleModelDuplicate.setAge(29);
        System.out.println(exampleModelDuplicate);
        System.out.println(exampleModel.equals(exampleModelDuplicate));
    }
}