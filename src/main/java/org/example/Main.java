package org.example;


import org.example.Configuration.AppConfig;
import org.example.Entity.Ability;
import org.example.Entity.Burn;
import org.example.Entity.Fly;
import org.example.Entity.Player;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Player player = new Player();
        Fly ability = new Fly();
        player.setAbility(ability);
        player.perform();

        Ability ability2 = new Burn();

        player.setAbility(ability2);
        player.perform();
        System.out.println("------------------");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Player player1 = (Player) context.getBean("player");
        player1.perform();
        System.out.println("------------------");
        ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
        Player player2 = context2.getBean(Player.class);
        player2.perform();

    }
}