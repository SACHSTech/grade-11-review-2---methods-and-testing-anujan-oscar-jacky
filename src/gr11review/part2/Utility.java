package gr11review.part2;
import java.io.*;
import java.util.*;
import java.io.IOException;

public class Utility {

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

