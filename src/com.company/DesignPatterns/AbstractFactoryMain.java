package src.com.company.DesignPatterns;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractBikeFactory factory = new RoadBikeFactory();
        BikeFrameInterface frame = factory.createFrame();
        BikeSeatInterface seat = factory.createSeat();
        System.out.println(frame.getFrameParts());
        System.out.println(seat.getSeatParts());

        AbstractBikeFactory factory2 = new MountainBikeFactory();
        BikeFrameInterface frame2 = factory2.createFrame();
        BikeSeatInterface seat2 = factory2.createSeat();
        System.out.println(frame2.getFrameParts());
        System.out.println(seat2.getSeatParts());

        AbstractBikeFactory factory3 = new KidsBikeFactory();
        KidsBikeFrame frame3 = (KidsBikeFrame) factory3.createFrame();
        KidsBikeSeat seat3 = (KidsBikeSeat) factory3.createSeat();
        System.out.println(frame3.getFrameParts());
        System.out.println(seat3.getSeatParts());
    }
}
