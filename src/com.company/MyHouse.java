package src.com.company;

public class MyHouse {
    /**
     * walls
     * doors
     * windows
     * hallways
     * foundation
     * floor
     * roof
     *
     * What my Object Knows!!!!!
     */
    public int walls;
    public int doors;
    public int hallways;
    public int windows;
    public boolean roof;
    public boolean floor;
    public int levels;
    public String foundation;
    public boolean secretPassage;
    public boolean hasSpirits;
    public int fireplace;
    public String raccoons;
    public int deadBodies;

    // What my Object Does
    public void openDoors(){
        System.out.println("opened the front door");
    }
    public void closeddoors(){
        System.out.println("closed the front door");
    }
    public void openWindow(){
        System.out.println("opened bedroom window");
    }
    private void closedWindow(){
        System.out.println("closed the bedroom window");
    }
    public void deadBodies(){
        System.out.println("man that dead body in the living room wall stinks");
    }
    public void floor(){
        System.out.println("clean the hardwood floor");
    }

}
