package src.com.company;

public class workingWithEnCaps {
    public static void main(String[] args) {

        // Creating an Object from a Class.
        Encaps target = new Encaps();

        // Set encapsulated variable.
        target.setMyName("Steven");

        // Retrieved encapsulated.
        System.out.println(target.getMyName());

        // Sets encapsulated variable.
        target.setNumber(1998 + 1);

        // retrieved encapsulated.
        System.out.println(target.getNumber());


    }


}
