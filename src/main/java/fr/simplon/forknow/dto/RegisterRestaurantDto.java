
package fr.simplon.forknow.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRestaurantDto { // Infos demandées lors de la création d'un restaurant
    @NotEmpty(message = "Name must not be empty")
    private String name;

    @NotEmpty(message = "Speciality must not be empty")
    private String speciality;

    private String image;
}
