package src.com.company.DesignPatterns;

public abstract class AbstractBikeFactory {

    abstract BikeFrameInterface createFrame();
    abstract BikeSeatInterface createSeat();
    abstract BikePaintInterface getPaintForBike();


}
