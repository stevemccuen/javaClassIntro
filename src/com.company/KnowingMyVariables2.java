package src.com.company;

public class KnowingMyVariables2 {
    public static void main(String[] args) {

        // Call all of our methods from here.
        knowingMyVariables2test();
    }

    // Write all of our methods out fo here.
    public static void knowingMyVariables2test(){
        MyFavorite Steven = new MyFavorite();

        Steven.setMyName("Steven McCuen");
        Steven.setfavColor("saphire blue");
        Steven.setfavFood("mexican");

        System.out.println(Steven.getfavColor());
        System.out.println(Steven.getfavFood());
        System.out.println(Steven.getMyName());

        Steven.playFavSong("Enjoy - Tech N9ne");
    }

}
