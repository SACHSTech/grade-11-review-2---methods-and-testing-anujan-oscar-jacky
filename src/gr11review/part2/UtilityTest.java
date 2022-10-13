package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import gr11review.part2.Utility;


public class UtilityTest{

    /**
     * @author Lin. O
     * test cases for utility.java
     */
    // array list for xyBalance Test
    int[] arrayOne = {1, 2, 3};
    int[] arrayCorrect = {1, 3, 3};
    int[] arrayTwo = {1, 2, 3, 2, 5, 2};
    int[] arrayCorrectTwo = {1, 3, 3, 5, 5, 2};
    int[] arrayThree = {3, 4};
    int[] arrayCorrectThree = {3, 4};

    // array list for canBalance test 
    int[] arrayOneCanBalance = {1, 1, 1, 2, 1};
    int[] arrayTwoCanBalance = {2, 1, 1, 2, 1};
    int[] arrayThreeCanBalance = {10, 10};

    // array list for split test 
    int[][] arrayOneSplit = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] arrayOneSplitCorrect = {{1, 2}, {4, 5}};
    int[][] arrayTwoSplit = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
    int[][] arrayTwoSplitCorrect = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
    int[][] arrayThreeSplit = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] arrayThreeSplitCorrect = {{1}};

    /**
     * xyBalance Test 
     * test with numbers in the middle 
     */
    @Test
    void xyBalanceTest1 () throws IOException{
        assertEquals(123, Utility.sumNumbers("abc123xyz"));
    }

    /**
     * xyBalance Test 
     * test with numbers seperate 
     */
    @Test
    void xyBalanceTest2 () throws IOException{
        assertEquals(55, Utility.sumNumbers("dd11e44"));
    }

    /**
     * xyBalance Test 
     * test with numbers only
     */
    @Test
    void xyBalanceTest3 () throws IOException{
        assertEquals(30, Utility.sumNumbers("8 22"));
    }

    /**
     * alphaWord Test 
     * test random words in random alphabetical order 
     */
    @Test
    void alphaWord1 () throws IOException{
        assertEquals("adipiscing", Utility.alphaWord("/Users/tobbykin/github-classroom/SACHSTech/grade-11-review-2---methods-and-testing-anujan-oscar-jacky/src/gr11review/part2/words"));
    }

    /**
     * notAlone Test 
     * testing with 3 elements
     */
    @Test
    void notAlone1() throws IOException{
        assertArrayEquals(arrayCorrect, Utility.notAlone(arrayOne, 2));
    }

    /**
     * notAlone Test 
     * testing with many elements 
     */
    @Test
    void notAlone2 () throws IOException{
        assertArrayEquals(arrayCorrectTwo, Utility.notAlone(arrayTwo, 2));
    }

    /**
     * notAlone Test 
     * test with two elements
     */
    @Test
    void notAlone3 () throws IOException{
        assertArrayEquals(arrayCorrectThree, Utility.notAlone(arrayThree, 3));
    }

    /**
     * canBalance Test 
     * test with unbalanced array with unbalanced sides
     */
    @Test
    void canBalance1 () throws IOException{
        assertEquals(true, Utility.canBalance(arrayOneCanBalance));
    }

    /**
     * canBalance Test 
     * test with unbalanced array
     */
    @Test
    void canbalance2 () throws IOException{
        assertEquals(false, Utility.canBalance(arrayTwoCanBalance));
    }

    /**
     * canBalance Test 
     * test with even sides with same element
     */
    @Test
    void canbalance3 () throws IOException{
        assertEquals(true, Utility.canBalance(arrayThreeCanBalance));
    }

    /**
     * split Test 
     * test return to a specific point in the array
     */
    @Test
    void split1 () throws IOException{
        assertArrayEquals(arrayOneSplitCorrect, Utility.split(arrayOneSplit, 1, 1));
    }

    /**
     * split Test 
     * test to return the entire array
     */
    @Test
    void split2 () throws IOException{
        assertArrayEquals(arrayTwoSplitCorrect, Utility.split(arrayTwoSplit, 2, 2));
    }

    /**
     * split Test 
     * test to return first number from the array
     */
    @Test
    void split3 () throws IOException{
        assertArrayEquals(arrayThreeSplitCorrect, Utility.split(arrayThreeSplit, 0, 0));
    }
  
}