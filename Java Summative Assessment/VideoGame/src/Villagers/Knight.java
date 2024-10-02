package Villagers;

import java.util.Random;
import java.util.Scanner;

public class Knight extends Villager{

    private Weapon weapon;
    private int strength;

    public Knight(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        generateStrength();
        selectWeapon();
        System.out.println("\nKnight created\n");
        print();
    }

    private void generateStrength(){

    }

    private void selectWeapon(){

    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getStrength() {
        return strength;
    }

    public void print(){
        System.out.println("Name: "+getFirstName() + " " + getLastName());
        System.out.println("Age: "+getAge());
        System.out.println("Strength: "+getStrength());
        System.out.println("Weapon "+getWeapon());
    }
}
