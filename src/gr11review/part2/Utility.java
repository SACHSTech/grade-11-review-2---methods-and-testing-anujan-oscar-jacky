package gr11review.part2;
import java.io.*;
import java.util.*;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;
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
 
            // loop until i
            for (int j = 1; j <= i; j++) {
 
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

    public static void main(String[] args) {
    }    

    /**
     * @param filenametxt test file with words 
     * @return
     * @throws IOException
     * Inputs file into method and outputs longest word from it
     */
    
    public static String longestWord(String filenametxt) throws IOException{ // takes a file with words and outputs the longest word from it
        BufferedReader sc = new BufferedReader(new FileReader(filenametxt));

        //initializing vars
        String stringFromFile; 
        int intLastLength = 0;
        int intCurrentLength;
        String stringLongestWord = "";

        
        while ((stringFromFile = sc.readLine()) != null) { //until no words remain in file
            stringFromFile = stringFromFile.strip();
            intCurrentLength = stringFromFile.length(); //current length is the length of the current parsed number
            
            if (intCurrentLength > intLastLength) { //if current length is longer than past longest word 
                stringLongestWord = stringFromFile; //make the longest word the current parsed string
                intLastLength = intCurrentLength; //make length of word the longest previous word
            }
            
        }
        return stringLongestWord; //return longest word      
    }

    /**
     * @param str string teested to see whether x's and y's are balanced
     * @return
     * Inputs string and outputs whether x's are "balanced" by the y's
     */


    public static boolean xyBalance(String str) { //returns whether xy balance is obtained through array
        boolean booleanBalance = true; //will be true if x is not in list 
        str = str.toLowerCase();

        char[] charArray = str.toCharArray(); //convert string to array

        for (char charLetter : charArray) { //parse through all letters in string
            if (charLetter == 'x') //if there is an x in the string, then it will be false until a y balances it out
                booleanBalance = false;
            
            if (charLetter == 'y') //if there is a y, it can balance previous x's
                booleanBalance = true;            
                
        }
        return booleanBalance;
    }

    /**
     * @param nums Array containung numbers
     * @return
     * Inputs an array, and outputs the same array but without the value 10
     */

    public static int[] withoutTen(int[] nums) { //returns array without the value of 10
        List <Integer> listNumArray = new ArrayList <> ();

        for (int intInArray : nums) { //convert array to arraylist
            listNumArray.add(intInArray);
        }
        

        while (listNumArray.contains(10)) { //remove all 10s
            listNumArray.remove(Integer.valueOf(10));
        }

        int [] arrayReturn = new int [listNumArray.size()];

        for (int i = 0; i < listNumArray.size(); i++) { //remake arraylist to an array
            arrayReturn[i] = listNumArray.get(i);
        }

        return arrayReturn;

    }

    /**
     * @param outer outer array of integers 
     * @param inner inner array of integers to test whether it is contained in the outer array
     * @return
     * Inputs "inner" and "outer" array, and finds whether inner exists within outer
     */

    public static boolean linearIn(int[] outer, int[] inner) {
        boolean booleanReturn = false; //default is false

        for (int i = 0; i < outer.length; i++){

            if (outer[i] == inner[0]) {
                booleanReturn = true; //if the outer array has the first value of inner, make it true for now

                for (int j = 1; j < inner.length; j++) {

                    try {
                        if (outer[i + j] != inner [j]) { //until the streak of consecutive values is broken
                            booleanReturn = false; //make it false
                        }
                    } catch (Exception e) {
                        booleanReturn = false;
                        break;
                    }

                }

                if (booleanReturn == true) { //if loop found that the inner was in the outer
                    break; //break from for loop
                }
            }
        }

        return booleanReturn;
    }


    /**
     * @param arr 2D array which will be reversed 
     * @return
     * Inputs 2d Array, and outputs the same array reversed
     */

    public static int[][] reverse(int[][] arr) {
        int [][] intReturnArray = new int [arr.length][arr[0].length]; //have the return array have the same dimensions are the original
        
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[0].length - 1; j >= 0; j--) {
                intReturnArray[arr.length - 1 - i][arr[0].length - 1 - j] = arr[i][j]; //fill array in reverse order 
            }
        }

        return intReturnArray;
    }







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