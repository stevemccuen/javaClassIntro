package src.com.company.DesignPatterns;

public class MountainBikeFrame extends KidsBikeFrame implements BikeFrameInterface{

    @Override
    public String getFrameParts() {
        return "Frame parts for the Mountain Bike";
    }
}
