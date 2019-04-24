package src.com.company;

public class MyFavorite {
    private String myName = "steven";
    private String favFood = "pizza";
    private String favColor = "midnight purple";

    public String getMyName() {
        return this.myName;
    }

    public void setMyName(final String myName) {
        this.myName = myName;
    }
    public String getfavFood(){
        return this.favFood;
    }
    public void setfavFood(final String favFood){
        this.favFood = favFood;
    }
    public String getfavColor(){
        return this.favColor;
    }
    public void setfavColor(final String favColor){
        this.favColor = favColor;
    }
    public  void playFavSong(final String favSong){
        System.out.println("Playing your favorite song:  " + favSong);

    }
}
