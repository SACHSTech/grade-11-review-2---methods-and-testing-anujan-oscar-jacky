package gr11review.part2;
import java.io.*;
import java.util.*;
import java.io.IOException;


public class Utility {

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




