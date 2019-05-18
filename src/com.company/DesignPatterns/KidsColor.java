package src.com.company.DesignPatterns;

import java.util.Random;

public class KidsColor implements BikePaintInterface {
    public String getPaintForBike() {
        String[] colors = {
                "Black banana", "pink Raspberry",
                "candy Apple", "Blue Kiwi"};
        Random r = new Random();
        int randomNumber = r.nextInt(colors.length);
        return colors[randomNumber];
    }
}