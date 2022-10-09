package gr11review.part2;
import java.io.*;
import java.util.*;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;

public class Utility {
    /**
     * @author Lin. O
     * solutions for grade 11 review 2
     */
    /**
     * Given a string, return the sum of the numbers appearing in the string, ignoring all other characters 
     * @param determine if xyz is in the string
     * @return true if xyz is in the middle of the string, or else return false 
     */
    public static int sumNumbers(String str) {

        // declare variables
        int intSum = 0;
        String strEmpty = "";
        
        // create for loop to go through each word and number and set conditions to find numbers and add them
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                if (i < str.length()-1 && Character.isDigit(str.charAt(i+1))) {
                    strEmpty += str.charAt(i);
                }    
            else {
                strEmpty += str.charAt(i);
                intSum += Integer.parseInt(strEmpty);
                strEmpty = "";
            }
        }
    }
        return intSum;
}

    /**
     * Given the name of a file filenametxt that contains a single word on each line, returns the word that is alphabetically first.
     * @param filenametxt 
     * @return Words in alpahbetical order
     */
    public static String alphaWord(String filenametxt) throws IOException {

        // create an array list 
        ArrayList<String> str = new ArrayList<String>();

        // set variables 
        String strEmpty;

        // set buffered reader to read the files 
        BufferedReader bufferReader = new BufferedReader(new FileReader(filenametxt));

        // create while loop to add word to array
        while ((strEmpty = bufferReader.readLine()) != null) {
            str.add(strEmpty);
        }
        bufferReader.close();
        Collections.sort(str);
        String strFirstAlphabet = str.get(0);

        return strFirstAlphabet;
    }
    
    /**
     * Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.
     * @param nums Specific array
     * @param value replace the value 
     * @return a value replacing whatever is greater to the left or right of the value
     */
    public static int[] notAlone(int[] nums, int value) {

        // create a for loop to check for the numbers in an array to sort it out
        for (int i = 1; i < nums.length - 1; i++) {
            // create conditions to check if the numbers are alone or not 
            if (nums[i] == value) {
                if (nums[i-1] != nums[i] && nums[i+1] != nums[i]) {
                    if (nums[i+1] > nums[i-1]) {
                        nums[i] = nums[i+1];
                    }
                        else if (nums[i+1] < nums[i-1]) {
                            nums[i] = nums[i-1];
                        }
                    }
                }
            }
            return nums;
        }

        /**
         * Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
         * @param nums splt the array
         * @return true or false depending on if the array can be split equally 
         */
        public static boolean canBalance(int[] nums) {

            // delcare variable 
            int intSumOfLeft = 0;
            int intSumOfRight = 0;
    
            // check the array and get the sum from left side
            for (int i = 0; i < nums.length; i++) {
                intSumOfRight = 0;
                intSumOfLeft += nums[i];

                // create for loop to check the array and get the sum from right side
                for (int x = (nums.length - 1); x > i; x--) {
                    intSumOfRight += nums[x];

                    // if sum matches return true
                    if (intSumOfLeft == intSumOfRight && x == (i + 1)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /**
         * A method that returns a portion of a 2D array based on a specified row and col.
         * @param arr Array list
         * @param row The row in the array
         * @param col The coloumn in the array
         * @return a new array with the specific elements depending on the row and column 
         */
        public static int[][] split(int[][] arr, int row, int col) {

            // create array 
            int[][] originalArray = new int[row + 1][col + 1];
    
            // create for loop for the number of rows and coloumns 
            for (int i = 0; i <= row; i++) {
                for (int x = 0; x <= col; x++) {

                    // create the new array depending on the new rows and coloumns indicated
                    originalArray[i][x] = arr[i][x];
                }
            }
            return originalArray;
        }
    }