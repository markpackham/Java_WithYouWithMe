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

    private void populateTerritory(int iterations){

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
