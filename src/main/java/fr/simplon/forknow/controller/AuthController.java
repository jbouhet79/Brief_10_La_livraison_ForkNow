package fr.simplon.forknow.controller;
/*
import fr.simplon.forknow.dto.CartDto;
import fr.simplon.forknow.model.Count;
import fr.simplon.forknow.service.impl.CountServiceImpl;*/
import fr.simplon.forknow.dto.RegisterRestaurantDto;
import fr.simplon.forknow.service.RestaurantService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;
import fr.simplon.forknow.dto.RegisterDto;
import fr.simplon.forknow.model.Restaurant;
import fr.simplon.forknow.model.User;
import fr.simplon.forknow.service.UserService;
import jakarta.validation.Valid;

@Controller
public class AuthController {

    private final UserService userService;
    private final RestaurantService restaurantService;
/*    private final Count count;
    private final CountServiceImpl countService;*/

    @Autowired
    public AuthController(UserService userService , RestaurantService restaurantService/*Count count, CountServiceImpl countService*/) {
        this.userService = userService;
        this.restaurantService = restaurantService;
        /*this.count = count;
        this.countService = countService;*/
    }

    @GetMapping("/") // Page d'accueil
    public String home(Model model, Authentication authentication) {
        Optional<User> user = userService.from(authentication);
        if(user.isPresent()){
            model.addAttribute("currentUser", user.get());
        }
        return "forknow-index";
    }

    @GetMapping("/admin") // Page pour la gestion des comptes utilisateurs par l'administrateur (à créer)
    public String admin() {
        return "admin";
    }

    @GetMapping("/register") // Lien vers la page de création de compte
    public String register(Model model) {
        RegisterDto user = new RegisterDto();
        model.addAttribute("user", user);
        return "forknow-register";
    }

    @GetMapping("/register-restaurant") // Lien vers la page de création d'un restaurant
    public String registerRestaurant(Model model) {
       RegisterRestaurantDto restaurant = new RegisterRestaurantDto();
       model.addAttribute("restaurant", restaurant);
        return "forknow-register-restaurant";
    }

    @GetMapping("/restaurants") // Lien vers la page où sont listés les restaurants
    public String restaurants(Model model, Authentication authentication) {
        List<Restaurant> restaurants = restaurantService.findAllRestaurants();
        model.addAttribute("restaurants", restaurants);
        return "forknow-restaurants-list";
    }

    @GetMapping("/restaurant1") // Lien vers la page associé au Restaurant 1
    public String restaurant1(Model model, Authentication authentication) {
//         Optional<User> user = userService.from(authentication);
//         if(user.isPresent()){
//             model.addAttribute("currentUser", user.get());
// //            model.addAttribute("countCart", count);
//         }
        return "forknow-restaurant-TastyBites";
    }

    @PostMapping("/register/save") // Sauvegarde d'un nouveau compte
    public String registerUser(@Valid @ModelAttribute RegisterDto userMapping) {
        if(!userMapping.getPassword().equals(userMapping.getPasswordConfirm())){
            return "redirect:/register?error";
        }
        userService.saveUser(userMapping);
        return "redirect:/login?success=userRegistered";
    }

    @PostMapping("/register-restaurant/save") // Sauvegarde d'un nouveau restaurant
    public String registerRestaurant(@Valid @ModelAttribute RegisterRestaurantDto restaurantMapping) {
        restaurantService.saveRestaurant(restaurantMapping);
        return "redirect:/restaurants";
    }

    @PostMapping("/restaurant1/order") // Ajout d'un menu au panier (incrementation de la variable count) - A finir
    public String incrementCart(Model model) {
//        model.addAttribute("countCart", count);
        return "redirect:/forknow-restaurant-TastyBites";
    };

/*    @PostMapping("/cart/save") // Création du contenu d'un panier (Cart) - A faire
    public String registerCart(@Valid @ModelAttribute CartDto cartMapping) {
        cartService.saveCart(cartMapping);
        return "redirect:/login?success=cartRegistered";
    }*/
}