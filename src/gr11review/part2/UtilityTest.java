package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import gr11review.part2.Utility;

import java.io.*;
import java.util.*;

public class UtilityTest{
    int [] onlyTens = {10, 10, 10, 10, 10};
    int [] onlyTensEquals = {};
    int [] tensAtBeginning = {10, 10, 10, 34, 34, 60, 234, 34};
    int [] tensAtBeginningEquals = {34, 34, 60, 234, 34}
    int [] tensInMiddle = {20, 3, 4, 1, 4, 10, 10, 49, 10};
    int [] tensInMiddleEquals = {20, 3, 4, 1, 4, 49};
    int [] tensInEnd = {2, 2, 4, 234, 1, 10};
    int [] tensInEndEquals = {2, 2, 4, 234, 1};



    /**
     * FileIO 1
     * Test file with a single word in it
     */
    @Test
    void testSingleWord() throws IOException{
        assertEquals("singleWord", Utility.longestWord("C:\\Users\\shan2\\Desktop\\grade-11-review-2---methods-and-testing-anujan-oscar-jacky\\bin\\singleWord.txt"));
    }
    
    /**
     * FileIO 1
     * Test File with no words in it
     */
    @Test
    void testNoWords() throws IOException{
        assertEquals("", Utility.longestWord("C:\\Users\\shan2\\Desktop\\grade-11-review-2---methods-and-testing-anujan-oscar-jacky\\bin\\noWords.txt"));

    }

    /**
     * FileIO 1
     * Test file with longest word at the beginning of the file
     */
    @Test
    void testBeginningOfFile() throws IOException{
        assertEquals("beginning", Utility.longestWord("C:\\Users\\shan2\\Desktop\\grade-11-review-2---methods-and-testing-anujan-oscar-jacky\\bin\\beginning.txt"));
    }
    
    /**
     * FileIO 1
     * Test file with longest word in the middle of the file
     */
    @Test
    void testMiddleOfFile() throws IOException{
        assertEquals("middle", Utility.longestWord("C:\\Users\\shan2\\Desktop\\grade-11-review-2---methods-and-testing-anujan-oscar-jacky\\bin\\middle.txt"));
    }

   /**
    * FileIO 1
    * Test file with longest word at the end of the file
    */
    @Test
    void testEndOfFile() throws IOException{
        assertEquals("end", Utility.longestWord("C:\\Users\\shan2\\Desktop\\grade-11-review-2---methods-and-testing-anujan-oscar-jacky\\bin\\end.txt"));
    }

    /**
     * FileIO 1
    * Test file with longest word at the end of the file
    */
    @Test
    void testMultiple() throws IOException{
        assertEquals("multiple", Utility.longestWord("C:\\Users\\shan2\\Desktop\\grade-11-review-2---methods-and-testing-anujan-oscar-jacky\\bin\\multiple.txt"));
    }

    /**
     * FileIO 1
    * Test file where there are spaces
    */
    @Test
    void testSpaces() throws IOException{
        assertEquals("spaces", Utility.longestWord("C:\\Users\\shan2\\Desktop\\grade-11-review-2---methods-and-testing-anujan-oscar-jacky\\bin\\spaces.txt"));
    }

     /**
     * Methods 1
    * test if balance is true when there is no string
    */
    @Test
    void testBalanceNothing() throws IOException{
        assertTrue(Utility.xyBalance(""));
    }

     /**
     * Methods 1
    * test when balance is not there
    */
    @Test
    void testFalseBalance() throws IOException{
        assertFalse(Utility.xyBalance("sdfyvyvyvyvxyxyxxyx"));
    }

    /**
     * Methods 1
    * test when balance true
    */
    @Test
    void testTrueBalance() throws IOException{
        assertTrue(Utility.xyBalance("xyxyxyxyxxxxxxxxxxxxxy"));
    }

    /**
     * Methods 1
    * test without x or y
    */
    @Test
    void testWithout() throws IOException{
        assertTrue(Utility.xyBalance("dsdsdfsdfsdfsdfdsfdsf"));
    }

    /**
     * Methods 1
    * test with only x
    */
    @Test
    void testOnlyX() throws IOException{
        assertFalse(Utility.xyBalance("x"));
    }

    /**
     * Arrays 1D - 1
     * only 10s
     */

     @Test

     void testOnlyTens() throws IOException {
        assertTrue(Arrays.equals(onlyTensEquals, Utility.withoutTen(onlyTens)));
     }

      /**
     * Arrays 1D - 1
     * test when tens are at the beginning
     */

    @Test

    void testTensAtBeginning() throws IOException {
        assertTrue(Arrays.equals(tensAtBeginningEquals, Utility.withoutTen(tensAtBeginning)));
    }

      /**
     * Arrays 1D - 1
     * test when tens are in the middle 
     */

    @Test

    void testTensinMiddle() throws IOException {
       assertTrue(Arrays.equals(tensInMiddleEquals, Utility.withoutTen(tensInMiddle)));
    }

      /**
     * Arrays 1D - 1
     * test when tens are in the end
     */

    @Test

    void testTensinEnd() throws IOException {
       assertTrue(Arrays.equals(tensInEndEquals, Utility.withoutTen(tensInEnd)));
    }
     

}
