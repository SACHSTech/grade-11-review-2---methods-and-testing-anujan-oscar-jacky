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
    int [] tensAtBeginningEquals = {34, 34, 60, 234, 34};
    int [] tensInMiddle = {20, 3, 4, 1, 4, 10, 10, 49, 10};
    int [] tensInMiddleEquals = {20, 3, 4, 1, 4, 49};
    int [] tensInEnd = {2, 2, 4, 234, 1, 10};
    int [] tensInEndEquals = {2, 2, 4, 234, 1};

    int [][] reverseArray = {{1, 4, 3}, {4, 3, 2}, {23, 3, 4}};
    int [][] reverseArrayEquals = {{4, 3, 23}, {2, 3, 4}, {3, 4, 1}};

    int [] inner1 = {1, 23, 4};
    int [] outer1 = {1, 23, 4, 6, 30, 39};

    int [] inner2 = {2, 5, 10, 45, 4};
    int [] outer2 = {1, 23, 4, 6, 30, 39, 1, 23, 4};

    int [] inner3 = {2, 4, 2, 5};
    int [] outer3 = {2, 4, 2};



    /**
     * FileIO 1
     * Test file with a single word in it
     */
    @Test
    void longestWordTest1() throws IOException{
        assertEquals("singleWord", Utility.longestWord("C:\\Users\\shan2\\Desktop\\grade-11-review-2---methods-and-testing-anujan-oscar-jacky\\bin\\singleWord.txt"));
    }
    
    /**
     * FileIO 1
     * Test File with no words in it
     */
    @Test
    void longestWordTest2() throws IOException{
        assertEquals("", Utility.longestWord("C:\\Users\\shan2\\Desktop\\grade-11-review-2---methods-and-testing-anujan-oscar-jacky\\bin\\noWords.txt"));

    }

    /**
     * FileIO 1
     * Test file with longest word at the beginning of the file
     */
    @Test
    void longestWordTest3() throws IOException{
        assertEquals("beginning", Utility.longestWord("C:\\Users\\shan2\\Desktop\\grade-11-review-2---methods-and-testing-anujan-oscar-jacky\\bin\\beginning.txt"));
    }
    
    /**
     * FileIO 1
     * Test file with longest word in the middle of the file
     */
    @Test
    void longestWordTest4() throws IOException{
        assertEquals("middle", Utility.longestWord("C:\\Users\\shan2\\Desktop\\grade-11-review-2---methods-and-testing-anujan-oscar-jacky\\bin\\middle.txt"));
    }

   /**
    * FileIO 1
    * Test file with longest word at the end of the file
    */
    @Test
    void longestWordTest5() throws IOException{
        assertEquals("end", Utility.longestWord("C:\\Users\\shan2\\Desktop\\grade-11-review-2---methods-and-testing-anujan-oscar-jacky\\bin\\end.txt"));
    }

    /**
     * FileIO 1
    * Test file with longest word at the end of the file
    */
    @Test
    void longestWordTest6() throws IOException{
        assertEquals("multiple", Utility.longestWord("C:\\Users\\shan2\\Desktop\\grade-11-review-2---methods-and-testing-anujan-oscar-jacky\\bin\\multiple.txt"));
    }

    /**
     * FileIO 1
    * Test file where there are spaces
    */
    @Test
    void longestWordTest7() throws IOException{
        assertEquals("spaces", Utility.longestWord("C:\\Users\\shan2\\Desktop\\grade-11-review-2---methods-and-testing-anujan-oscar-jacky\\bin\\spaces.txt"));
    }

     /**
     * Methods 1
    * test if balance is true when there is no string
    */
    @Test
    void xyBalanceTest1 () throws IOException{
        assertTrue(Utility.xyBalance(""));
    }

     /**
     * Methods 1
    * test when balance is not there
    */
    @Test
    void xyBalanceTest2 () throws IOException{
        assertFalse(Utility.xyBalance("sdfyvyvyvyvxyxyxxyx"));
    }

    /**
     * Methods 1
    * test when balance true
    */
    @Test
    void xyBalanceTest3() throws IOException{
        assertTrue(Utility.xyBalance("xyxyxyxyxxxxxxxxxxxxxy"));
    }

    /**
     * Methods 1
    * test without x or y
    */
    @Test
    void xyBalanceTest4() throws IOException{
        assertTrue(Utility.xyBalance("dsdsdfsdfsdfsdfdsfdsf"));
    }

    /**
     * Methods 1
    * test with only x
    */
    @Test
    void xyBalanceTest5() throws IOException{
        assertFalse(Utility.xyBalance("x"));
    }

    /**
     * Arrays 1D - 1
     * only 10s
     */

     @Test
     void withoutTenTest1() throws IOException {
        assertTrue(Arrays.equals(onlyTensEquals, Utility.withoutTen(onlyTens)));
     }

      /**
     * Arrays 1D - 1
     * test when tens are at the beginning
     */

    @Test
    void withoutTenTest2() throws IOException {
        assertTrue(Arrays.equals(tensAtBeginningEquals, Utility.withoutTen(tensAtBeginning)));
    }

      /**
     * Arrays 1D - 1
     * test when tens are in the middle 
     */

    @Test
    void withoutTenTest3() throws IOException {
       assertTrue(Arrays.equals(tensInMiddleEquals, Utility.withoutTen(tensInMiddle)));
    }

      /**
     * Arrays 1D - 1
     * test when tens are in the end
     */

    @Test
    void withoutTenTest4() throws IOException {
       assertTrue(Arrays.equals(tensInEndEquals, Utility.withoutTen(tensInEnd)));
    }

      /**
     * Arrays - 7
     * test if array is reversed
     */

    @Test
    void reverseTest1() throws IOException {
       assertTrue(Arrays.deepEquals(reverseArrayEquals, Utility.reverse(reverseArray)));
    }

     /**
     * Arrays - 4
     * test inner is in outer
     */

    @Test
    void linearInTest1() throws IOException {
       assertTrue(Utility.linearIn(outer1, inner1));
    }

     /**
     * Arrays - 4
     * test if inner is not in outer
     */

    @Test
    void linearInTest2() throws IOException {
        assertFalse(Utility.linearIn(outer2, inner2));
    }

    /**
     * Arrays - 4
     * inner larger than outer, but outer still has first couple of inner
     */

    @Test
    void linearInTest3() throws IOException {
        assertFalse(Utility.linearIn(outer3, inner3));
    }
     

}
