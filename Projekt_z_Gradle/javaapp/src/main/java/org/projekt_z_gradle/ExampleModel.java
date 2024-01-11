package org.projekt_z_gradle;

import lombok.*;

/**
 * Created by Adam Seweryn
 */
@Builder
@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class ExampleModel {
private String hairColor;
private int height;
private int width;
private boolean isMale;
private int age;


}
