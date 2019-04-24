package src.com.company;

public class SimpleDotCom {

        int [] locationCells;
        int numOfHits;
        public void setLocationCells(final int[] locs){
            this.locationCells = locs;
        }
        public String checkYourself(final String stringGuess){
        final int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (final int cell : this.locationCells){
            // inside the loop
            if (guess == cell){
                result = "hit";
                break;
            }
        }// out of the loop
        if (this.numOfHits == this.locationCells.length){
            result = "you kilt it";
        }
        System.out.println(result);
        return result;
    }
}
