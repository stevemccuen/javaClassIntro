package src.com.company;

public class FullyEncapsulated {

    public static void main(String[] args) {

        MyEnCaps personalInfo = new MyEnCaps();
        personalInfo.setMyFullName("Steven McCuen");
        System.out.println(personalInfo.getMyFullName());
        personalInfo.setMyAge(43);
        System.out.println(personalInfo.getMyAge());
        personalInfo.setMyEmergencyNumber(6556356);
        System.out.println(personalInfo.getMyEmergencyNumber());
        personalInfo.setMyLocation("KCMO");
        System.out.println(personalInfo.getmyLocation());
        personalInfo.setMyCellNumber(2999373);

    }

}
