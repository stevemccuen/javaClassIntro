package src.com.company.DesignPatterns;

import java.util.Random;

public class RoadColor implements BikePaintInterface {
    public String getPaintForBike() {
        String[] colors = {
                "black Banana", "blue Dolphin",
                "pink Apple", "yellow Dog"};
        Random r = new Random();
        int randomNumber = r.nextInt(colors.length);
        return colors[randomNumber];
    }
}