package com.features2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;



public class UserSearchandEmail {

    String name;
    String email;

    public UserSearchandEmail(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public static void main(String[] args) {
        List<UserSearchandEmail> userData = new ArrayList<>();
        userData.add(new UserSearchandEmail("Dileep", "dileep@gmail.com"));
        userData.add(new UserSearchandEmail("Sandeep", null));
        userData.add(new UserSearchandEmail("Naveen", "naveen@gmail.com"));
        userData.add(new UserSearchandEmail("Mahesh", "mahesh@gmail.com"));

        String userToFind = "Mahesh";

        Function<String, String> toUpper = String::toUpperCase;

        Optional<String> emailOptional = userData.stream()
            .filter(user -> user.name.equalsIgnoreCase(userToFind))
            .map(user -> Optional.ofNullable(user.email)) 
            .findFirst() 
            .orElse(Optional.empty()); 

        emailOptional.map(toUpper)
                     .ifPresent(email -> System.out.println("Transformed Email :  " + email));
    }
}
