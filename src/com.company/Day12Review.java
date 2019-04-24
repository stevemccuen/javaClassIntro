package src.com.company;

public class Day12Review {
    // Access Modifiers

    public static void main(final String[] args) {
        //Objects
        // Creating a Instance
        MyHouse house1 = new MyHouse();
         // Giving the Instance a value
        house1.walls = 3;
        house1.deadBodies=15;
        house1.levels=3;
        house1.foundation="Concrete";
        house1.openDoors();

        System.out.println(house1.walls);
        System.out.println(house1.deadBodies);
        System.out.println(house1.levels);
        System.out.println(house1.windows);
        System.out.println(house1.floor);
        System.out.println(house1.roof);
        System.out.println(house1.foundation);
    }

    // Printing Info from the Object



}
