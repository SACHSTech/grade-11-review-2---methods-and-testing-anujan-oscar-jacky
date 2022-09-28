package gr11review.part2;

import java.io.*;

public class Utility {

    public static int sumNumbers(String str) {
        int intSum = 0;
        String strEmpty = "";
        
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(i)) {
                if (i < str.length() && Character.isDigit(i++));    
                strEmpty += i;
            }
            else {
                strEmpty += i;
                intSum += Integer.parseInt(strEmpty);
                strEmpty = "";
            }

        }
        return intSum;
    }

    



    

    
}
