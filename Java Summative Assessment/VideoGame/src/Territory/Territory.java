package Territory;

import Villagers.Knight;
import Villagers.Villager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Villagers are held in a territory
public class Territory {

    private String name;
    private List<Villager> villagers = new ArrayList<Villager>();

    public Territory(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nName of territory: ");
        this.name = scanner.nextLine();
        System.out.print("How big is your territory?: ");
        populateTerritory(Integer.parseInt(scanner.nextLine()));
    }

    // User must fill out the 3 villager parameters, then calls the Knight constructor
    private void populateTerritory(int iterations){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<iterations-1; i++){
            System.out.print("\nEnter first name:" );
            String fName = scanner.nextLine();
            System.out.print("Enter last name: ");
            String sName = scanner.nextLine();
            System.out.print("Enter age: ");
            int age = Integer.parseInt(scanner.nextLine());
            this.villagers.add(new Knight(fName, sName, age));
        }
    }

    public String getName() {
        return name;
    }

    public List<Villager> getVillagers() {
        return villagers;
    }

    public void printVillagers(){
        for(Villager v: this.villagers){
            if(v.getClass()==Knight.class){
                ((Knight) v).print();
            }
        }
    }
}
