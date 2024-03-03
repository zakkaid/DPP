package org.example.Dynamique;

import org.example.Entity.Ability;

import org.example.Entity.Player;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("src/main/java/org/example/config.txt"));
            Player player = (Player) Class.forName(sc.nextLine()).newInstance();
            player.setAbility((Ability) Class.forName(sc.nextLine()).newInstance());
            player.perform();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
