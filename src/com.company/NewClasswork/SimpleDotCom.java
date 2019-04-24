package src.com.company.NewClasswork;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits;

    public void setLocationCells(final int[] locs)
    {
        this.locationCells = locs;
    }

    public String checkYourself(final String stringGuess) {
        final int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (final int cell: this.locationCells)
        {
            if (guess == cell) {
                result = "hit";
                this.numOfHits++;
                break;
            }
        }
        if (this.numOfHits == this.locationCells.length)
        {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}