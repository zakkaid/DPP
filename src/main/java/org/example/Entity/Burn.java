package org.example.Entity;

import org.springframework.stereotype.Component;


public class Burn implements Ability{

    @Override
    public void activate() {
        System.out.println("burn");
    }


}
