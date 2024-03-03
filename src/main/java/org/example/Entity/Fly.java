package org.example.Entity;

import org.springframework.stereotype.Component;

@Component
public class Fly implements Ability{

    @Override
    public void activate() {
        System.out.println("fly");
    }
}
