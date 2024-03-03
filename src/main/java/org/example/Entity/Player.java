package org.example.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Player {

    Ability ability;

    @Autowired
    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public void perform(){
        System.out.println("begin performing");
        ability.activate();
        System.out.println("performed");
    }
}
