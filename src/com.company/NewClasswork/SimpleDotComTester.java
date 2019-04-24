package src.com.company.NewClasswork;

public class SimpleDotComTester {

    public static void main(final String[] args)
    {
        final SimpleDotCom dot = new SimpleDotCom();
        final int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        final String userGuess = "2";
        final String result = dot.checkYourself(userGuess);
    }
}
