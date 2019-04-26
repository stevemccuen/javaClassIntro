package src.com.company;

public class MyEnCaps {

    private String myFullName;
    private int myAge;
    private long myEmergencyNumber;
    private String myLocation;
    private long myCellNumber;

    public void setMyFullName(String myFullName){
        this.myFullName = myFullName;
    }
    public String getMyFullName(){
        return myFullName;
    }
    public void setMyAge(int myAge){
        this.myAge = myAge;
    }
    public int getMyAge(){
        return myAge;
    }
    public void setMyEmergencyNumber(long myEmergencyNumber){
        this.myEmergencyNumber = myEmergencyNumber;
    }
    public long getMyEmergencyNumber(){
        return this.myEmergencyNumber;
    }
    public void setMyLocation(String myLocation){
        this.myLocation = myLocation;
    }
    public String getmyLocation(){
        return this.myLocation;
    }
    public void setMyCellNumber(long myCellNumber){
        this.myCellNumber = myCellNumber;
    }
    public long getMyCellNumber(){
        return this.myCellNumber;
    }

}
