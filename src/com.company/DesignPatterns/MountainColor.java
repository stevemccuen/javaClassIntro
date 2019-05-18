package src.com.company.DesignPatterns;

import java.util.Random;

public class MountainColor implements BikePaintInterface{
   public String getPaintForBike(){
        String[] colors = {
           "strawberry banana" , "blue Raspberry" ,
           "green Apple" , "yellow Kiwi"};
       Random r = new Random();
       int randomNumber = r.nextInt(colors.length);
       return colors[randomNumber];
   }
}
