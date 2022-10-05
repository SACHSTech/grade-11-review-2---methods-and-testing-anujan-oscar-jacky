package gr11review.part2;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
 
public class Utility {
 
     /**
     * Given a string, determine if 'xyz' is in the middle
     *
     * @param str Given a string, determine if 'xyz' is in the middle
     * @return true if 'xyz' is in the middle of the string, false otherwise
     * @author J. Wang
     */
    public static boolean xyzMiddle(String str) {
        int intMiddle = str.length() / 2 - 1;
 
        // check right of middle, if 'xyz' is found, return true
        if (str.length() >= 3 && (str.substring(intMiddle, intMiddle + 3).equals("xyz"))) {
            return true;
        }
 
        // check left of middle, if 'xyz' is found, return true
        if (str.length() % 2 == 0 && str.substring(intMiddle - 1, intMiddle + 2).equals("xyz")) {
            return true;
        }
 
        // return false if xyz is not found in the middle of the string
        return false;
   }
 
   }



