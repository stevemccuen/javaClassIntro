package src.com.company;
public class DogYearCalc {
    public static void main(final String[] args) {
        DogYearCalc.CheckDog("Fido", 12, 20);
        DogYearCalc.CheckDog("Socks", 11, 23);
        DogYearCalc.CheckDog("Killer", 6, 69);
        DogYearCalc.CheckDog("Kilo", 7, 8);
        DogYearCalc.CheckDog("Beast", 24, 34);
        DogYearCalc.CheckDog("Ruby", 19, 105);
        DogYearCalc.CheckDog("Steve", 30, 49);
        DogYearCalc.CheckDog("Beaver", 8, 13);
        DogYearCalc.CheckDog("Rover", 9, 22);
        DogYearCalc.CheckDog("Benji", 14, 39);
        DogYearCalc.CheckDog("Max", 16, 4);
        DogYearCalc.CheckDog("Flower", 32, 41);
        DogYearCalc.CheckDog("Doggy", 18, 65);
        DogYearCalc.CheckDog("Spots", 5, 55);
        DogYearCalc.CheckDog("Socks", 22, 29);
        DogYearCalc.CheckDog("Rocky", 4, 19);
        DogYearCalc.CheckDog("Charlie", 2, 76);
        DogYearCalc.CheckDog("Ceaser", 10, 99);
        DogYearCalc.CheckDog("Cali", 15, 33);
        DogYearCalc.CheckDog("Dorothy", 6, 20);
        DogYearCalc.CheckDog("Bull", 1, 9);
        // not in here
    }
// But out Here.


        // Grabs a Dog to send throughout the Dog Calc Program
        public static void CheckDog(final String dogName, final int age, final int weight){
            final int dogAIHY = DogYearCalc.DogYearCalc(age,weight);
            System.out.println("Your dog " + dogName + " is " + dogAIHY + " Years Old ");

        }

    public static int DogYearCalc(final int age , final int weight){
        switch(age){
            case 1 : return 15;
            case 2 : return 24;
            case 3 : return 28;
            case 4 : return 32;
            case 5 : return 36;
            default: {
                if(age > 5 && weight < 21){
                    final int rate = age - 5;
                    final int humanYears = 4 * rate;
                    return humanYears + 36;

                    /*
                    Flat Method
                    return ((age - 5) * 4) + 36;
                    */
                }
                else if( age > 5 && weight < 51){
                    return ((age - 5) * 6) + 36;
                }
                else if( age > 5 && weight > 50){
                    return ((age - 5) * 9) + 36;
                }
            }
        }
        return 0;
    }



}

