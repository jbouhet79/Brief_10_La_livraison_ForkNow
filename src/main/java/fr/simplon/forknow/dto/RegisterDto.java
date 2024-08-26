package fr.simplon.forknow.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDto { // Infos demandées lors de la création d'un compte
    @NotEmpty(message = "Username must not be empty")
    private String username;

    @NotEmpty(message = "Username must not be empty")
    private String displayName;

    @NotEmpty(message = "Email must not be empty")
    private String email;

    @NotEmpty(message = "Password must not be empty")
    private String password;
    
    @NotEmpty(message = "PasswordConfirm must not be empty")
    private String passwordConfirm;
}