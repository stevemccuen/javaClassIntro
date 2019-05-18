package src.com.company.DesignPatterns;

public class KidsBikeFactory extends AbstractBikeFactory {

    @Override
   BikeFrameInterface createFrame(){
       return new KidsBikeFrame();
   }
    @Override
    BikeSeatInterface createSeat(){
        return new KidsBikeSeat();
    }

    @Override
    BikePaintInterface getPaintForBike() {
        return new KidsColor();
    }
}