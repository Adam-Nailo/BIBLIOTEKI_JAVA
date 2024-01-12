package org.projekt_z_gradle;

import lombok.*;

import java.util.List;

/**
 * Created by Adam Seweryn
 */
@Builder
@Data
public class ExampleModel {
private String hairColor;
private int height;
private int width;
private boolean isMale;
private int age;
private List<Cloth> cloth;
}
