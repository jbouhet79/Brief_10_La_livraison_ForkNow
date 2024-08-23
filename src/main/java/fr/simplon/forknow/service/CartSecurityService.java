/*
package fr.simplon.forknow.service;

import fr.simplon.forknow.model.User;
import fr.simplon.forknow.model.Cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.cartdetails.CartDetails;
import org.springframework.security.core.cartdetails.CartDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CartSecurityService implements UserDetailsService {

    private CartService cartService;

    @Autowired
    public CartSecurityService(UserService userService) {
        this.cartService = cartService;
    }

    @Override
    public CartDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = cartService.findByUsername(username)
                        .orElseThrow(()->new UsernameNotFoundException("User didn't exist."));

        return org.springframework.security.core.cartdetails.Cart.builder()
                    .username(user.getUsername())
                    .password(user.getPassword())
                    .roles(user.getRole().name())
                    .build();
    }

}*/
