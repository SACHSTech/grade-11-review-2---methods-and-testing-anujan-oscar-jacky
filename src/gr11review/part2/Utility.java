package gr11review.part2;
import java.io.*;
import java.util.*;
import java.io.IOException;

/**
* A bunch of methods in a class
* @author: Anujan
*
*/



public class Utility {
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


    public static String alphaWord(String filenametxt) throws IOException {

        // create an array list 
        ArrayList<String> str = new ArrayList<String>();

        // set variables 
        String strEmpty;

        // set buffered reader to read the files 
        BufferedReader bufferReader = new BufferedReader(new FileReader(filenametxt));

        while ((strEmpty = bufferReader.readLine()) != null) {
            str.add(strEmpty);
        }
        bufferReader.close();

        Collections.sort(str);

        String strFirstAlphabet = str.get(0);

        return strFirstAlphabet;
    }
    

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

        public static boolean canBalance(int[] nums) {

            int intSumLeft = 0;
            int intSumRight = 0;
    
            for (int i = 0; i < nums.length; i++) {
                intSumRight = 0;
                intSumLeft += nums[i];
                for (int x = (nums.length - 1); x > i; x--) {
                    intSumRight += nums[x];
                    if (intSumLeft == intSumRight && x == (i + 1)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public static int[][] split(int[][] arr, int row, int col) {


            int[][] newArray = new int[row + 1][col + 1];
    
            for (int i = 0; i <= row; i++) {
                for (int x = 0; x <= col; x++) {

                    newArray[i][x] = arr[i][x];
                }
            }
            return newArray;
        }
    }




