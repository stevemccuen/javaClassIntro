package src.com.company.DesignPatterns;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractBikeFactory factory = new RoadBikeFactory();
        BikeFrameInterface frame = factory.createFrame();
        BikeSeatInterface seat = factory.createSeat();
        BikePaintInterface color = factory.getPaintForBike();
        System.out.println(frame.getFrameParts());
        System.out.println(seat.getSeatParts());
        System.out.println(color.getPaintForBike());

        AbstractBikeFactory factory2 = new MountainBikeFactory();
        BikeFrameInterface frame2 = factory2.createFrame();
        BikeSeatInterface seat2 = factory2.createSeat();
        BikePaintInterface color2 = factory2.getPaintForBike();
        System.out.println(frame2.getFrameParts());
        System.out.println(seat2.getSeatParts());
        System.out.println(color2.getPaintForBike());

        AbstractBikeFactory factory3 = new KidsBikeFactory();
        KidsBikeFrame frame3 = (KidsBikeFrame) factory3.createFrame();
        KidsBikeSeat seat3 = (KidsBikeSeat) factory3.createSeat();
        BikePaintInterface color3 = factory3.getPaintForBike();
        System.out.println(frame3.getFrameParts());
        System.out.println(seat3.getSeatParts());
        System.out.println(color3.getPaintForBike());
    }
}
