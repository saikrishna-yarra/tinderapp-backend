package com.project.tinder_ai_backend.profiles;

import org.springframework.data.annotation.Id;

public record Profile(
        String id,
        String firstName,
        String lastName,
        int age,
        String ethinicity,
        Gender gender,
        String bio,
        String imageUrl,
        String myersGriggsPersonalityType
){

}
