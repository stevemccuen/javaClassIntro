package src.com.company.DesignPatterns;

public class MountainBikeFactory extends AbstractBikeFactory {

    @Override
    BikeFrameInterface createFrame(){
        return new MountainBikeFrame();
    }
    @Override
    BikeSeatInterface createSeat(){
        return new MountainSeat();
    }

    @Override
    BikePaintInterface getPaintForBike() {
        return new MountainColor();
    }
}
