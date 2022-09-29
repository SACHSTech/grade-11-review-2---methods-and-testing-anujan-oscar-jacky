package gr11review.part2;
import java.io.*;
import java.util.*;
<<<<<<< HEAD

=======
>>>>>>> 9cf5b1ee94aae3cf29b28453f8ecedc96777878f
import java.io.IOException;

public class Utility {
    public static void main(String[] args) {
    }    

<<<<<<< HEAD
    /**
     * @param filenametxt
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
     * @param str
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
     * @param nums
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
     * @param outer
     * @param inner
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
     * @param arr
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







    
=======
    public static int sumNumbers(String str) {
        int intSum = 0;
        String strEmpty = "";
        
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
>>>>>>> 9cf5b1ee94aae3cf29b28453f8ecedc96777878f
}

/* 
    public static String alphaWord(String filenametxt) {

        String strFile = sc.readline;
        int intSum = 0;
        String strEmpty = "";
        String str;
        char charFirst = str.charAt(0);

        for (int i = 0; i < )
    }*/
    public static int[] notAlone(int[] nums, int value) {

        for (int i = 0; i < nums.length; i++) {
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
    }

