package src.com.company;

public class SimpleDotComTestDrive {
    public static void main(final String[] args) {
        final SimpleDotCom dot = new SimpleDotCom();
        final int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        final String userGuess = "4";
        final String result = dot.checkYourself (userGuess);

    }
}
