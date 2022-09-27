package gr11review.part2;
import java.io.*;
import java.util.*;

import java.io.IOException;

public class Utility {

    public static void main(String[] args) throws IOException{
        
        int [][] inner = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(reverse(inner)));

    }

    
    
    public static String longestWord(String filenametxt) throws IOException{ // takes a file with words and outputs the longest word from it
        BufferedReader sc = new BufferedReader(new FileReader(filenametxt));

        //initializing vars
        String stringFromFile; 
        int intLastLength = 0;
        int intCurrentLength;
        String stringLongestWord = "";

        
        while ((stringFromFile = sc.readLine()) != null) { //until no words remain in file
            intCurrentLength = stringFromFile.length(); //current length is the length of the current parsed number
            
            if (intCurrentLength > intLastLength) { //if current length is longer than past longest word 
                stringLongestWord = stringFromFile; //make the longest word the current parsed string
                intLastLength = intCurrentLength; //make length of word the longest previous word
            }
            
        }
        return stringLongestWord; //return longest word      
    }


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

    public static boolean linearIn(int[] outer, int[] inner) {
        boolean booleanReturn = false; //default is false

        for (int i = 0; i < outer.length; i++){

            if (outer[i] == inner[0]) {
                booleanReturn = true; //if the outer array has the first value of inner, make it true for now

                for (int j = 1; j < inner.length; j++) {

                    if (outer[i + j] != inner [j]) { //until the streak of consecutive values is broken
                        booleanReturn = false; //make it false
                    } 

                }

                if (booleanReturn == true) { //if loop found that the inner was in the outer
                    break; //break from for loop
                }
            }
        }

        return booleanReturn;
    }


    public static int[][] reverse(int[][] arr) {
        int [][] intReturnArray = new int [arr.length][arr[0].length]; //have the return array have the same dimensions are the original
        
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[0].length - 1; j >= 0; j--) {
                intReturnArray[arr.length - 1 - i][arr[0].length - 1 - j] = arr[i][j]; //fill array in reverse order 
            }
        }

        return intReturnArray;
    }







    
}
