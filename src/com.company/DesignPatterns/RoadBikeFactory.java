package src.com.company.DesignPatterns;

public class RoadBikeFactory extends AbstractBikeFactory {
    @Override
    RoadBike createFrame(){
        return new RoadBike();
    }
    @Override
    BikeSeatInterface createSeat() {
        return new RoadSeat();
    }
        BikePaintInterface getPaintForBike(){
        return new RoadColor();
    }
}
