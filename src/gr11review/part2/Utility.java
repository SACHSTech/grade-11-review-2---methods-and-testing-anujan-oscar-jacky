package gr11review.part2;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
 
public class Utility {
 
     /**
     *
     * @param str Given a string, determine if 'xyz' is in the middle
     * @return true if 'xyz' is in the middle of the string, false otherwise
     * 
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

     /**
     * 
     * @param filenametxt Test file words that will be looked at to see which has the most vowels
     * @return Word with the most vowels
     *
     */
    public static String vowelCount(String filenametxt) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filenametxt));
       
 
        // variables
        String strMostVowels = "";
        String strCurrentWord;
        int highestCountVowel = -1;
        int intVowelCount = 0;
 
        String line = reader.readLine();
 
        while (line != null) {
            strCurrentWord = line;
 
            for (int i = 0; i < strCurrentWord.length(); i++) {
                if (strCurrentWord.charAt(i) == 'a' || strCurrentWord.charAt(i) == 'e' || strCurrentWord.charAt(i) == 'i'
                        || strCurrentWord.charAt(i) == 'o' || strCurrentWord.charAt(i) == 'u') {
                    intVowelCount++;
                }
 
            }
            // Checks to see if the vowel count for the word is higher than the highest one
            if (intVowelCount > highestCountVowel) {
                highestCountVowel = intVowelCount;
                strMostVowels = strCurrentWord;
            }
            intVowelCount = 0;
            line = reader.readLine();
        }
        reader.close();
        return strMostVowels;
    }
   
     /**
     *
     * @param nums The integer array
     * @return New array with zeroes at the front
     * 
     */
    public static int[] zeroFront(int[] nums) {
        int intUpdate = 0;
 
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                nums[i] = nums[intUpdate];
                nums[intUpdate] = 0;
                intUpdate++;
            }
 
        }
        for (int c = 0; c < nums.length; c++) {
            System.out.print(nums[c]);
        }
        System.out.println("");
 
        return nums;
 
    }
 
     /**
     *
     * @param n Number that will be at the end of the pattern (1, 1, 2 ... 1, 2, 3
     *          .. n)
     * @return An array with the pattern {1, 1, 2, 1, 2, 3, ... 1, 2, 3 .. n}
     * 
     */
    public static int[] seriesUp(int n) {
 
        // new array
        int[] newArray = new int[n * (n + 1) / 2];
 
        // variable
        int intCounter = 0;
 
        // loop through numbers until n
        for (int i = 1; i <= n; i++) {
 
            // iterate through loop until i
            for (int j = 1; j <= i; j++) {
 
                // array equal to j
                newArray[intCounter++] = j;
            }
        }
 
        return newArray;
    }
 
    /**
     *
     * @param arr Gives a 2D array to be inverted
     * @return Inverted array
     *
     */
    public static int[][] invert(int[][] arr) {
 
        // variables
        int intColumnCount = arr[0].length;
        int intRowCount = arr.length;
 
        // create new array for inverted values
        int[][] result = new int[intColumnCount][intRowCount];
 
        // rows and columns are flipped
        for (int i = 0; i < intRowCount; ++i) {
            for (int j = 0; j < intColumnCount; ++j) {
                result[j][i] = arr[i][j];
            }
        }
        return result;
    }  
 
   }
 
 
 
 
 






