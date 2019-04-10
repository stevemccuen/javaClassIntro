package com.company;

public class MyFavorite {
    private String myName = "steven";
    private String favFood = "pizza";
    private String favColor = "midnight purple";

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }
    public String getfavFood(){
        return favFood;
    }
    public void setfavFood(String favFood){
        this.favFood = favFood;
    }
    public String getfavColor(){
        return favColor;
    }
    public void setfavColor(String favColor){
        this.favColor = favColor;
    }
    public  void playFavSong(String favSong){
        System.out.println("Playing your favorite song:  " + favSong);

    }
}
