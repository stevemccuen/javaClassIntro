package src.com.company.NewClasswork;




import java.io.*;
import java.util.*;

public class GameHelper {

    private static final String alphabet = "abcdefg";
    private final int gridLength = 7;
    private final int gridSize = 49;
    private final int [] grid = new int[this.gridSize];
    private int comCount;


    public String getUserInput(final String prompt) {
        String inputLine = null;
        System.out.print(prompt + "  ");
        try {
            final BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0 )  return null;
        } catch (final IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine.toLowerCase();
    }



    public ArrayList<String> placeDotCom(final int comSize) {                 // line 19
        final ArrayList<String> alphaCells = new ArrayList<String>();
        final String [] alphacoords = new String [comSize];      // holds 'f6' type coords
        String temp = null;                                // temporary String for concat
        final int [] coords = new int[comSize];                  // current candidate coords
        int attempts = 0;                                  // current attempts counter
        boolean success = false;                           // flag = found a good location ?
        int location = 0;                                  // current starting location

        this.comCount++;                                        // nth dot com to place
        int incr = 1;                                      // set horizontal increment
        if ((this.comCount % 2) == 1) {                         // if odd dot com  (place vertically)
            incr = this.gridLength;                               // set vertical increment
        }

        while ( !success & attempts++ < 200 ) {             // main search loop  (32)
            location = (int) (Math.random() * this.gridSize);      // get random starting point
            //System.out.print(" try " + location);
            int x = 0;                                        // nth position in dotcom to place
            success = true;                                 // assume success
            while (success && x < comSize) {                // look for adjacent unused spots
                if (this.grid[location] == 0) {                    // if not already used
                    coords[x++] = location;                    // save location
                    location += incr;                          // try 'next' adjacent
                    if (location >= this.gridSize){                 // out of bounds - 'bottom'
                        success = false;                         // failure
                    }
                    if (x>0 & (location % this.gridLength == 0)) {  // out of bounds - right edge
                        success = false;                         // failure
                    }
                } else {                                      // found already used location
                    // System.out.print(" used " + location);
                    success = false;                          // failure
                }
            }
        }                                                   // end while

        int x = 0;                                          // turn good location into alpha coords
        int row = 0;
        int column = 0;
        // System.out.println("\n");
        while (x < comSize) {
            this.grid[coords[x]] = 1;                              // mark master grid pts. as 'used'
            row = coords[x] / this.gridLength;             // get row value
            column = coords[x] % this.gridLength;                  // get numeric column value
            temp = String.valueOf(GameHelper.alphabet.charAt(column));   // convert to alpha

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;

            // System.out.print("  coord "+x+" = " + alphaCells.get(x-1));

        }
        // System.out.println("\n");

        return alphaCells;
    }
}