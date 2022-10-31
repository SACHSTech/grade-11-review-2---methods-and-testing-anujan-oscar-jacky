package gr11review.part2;

import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import java.io.IOException;


public class UtilityTest{

    int [] fourNumbers = {1, 0, 0, 1};
    int [] fiveNumbers = {0, 1, 1, 0, 1};
    int [] sixNumbers = {1, 2, 3, 0, 0, 5};
    int [] twoNumbers = {1, 0};

    int [][] invertArray = {{1,1,1}, {2,2,2}, {3,3,3}};
    int [][] invertArrayEquals = {{1,2,3}, {1,2,3}, {1,2,3}};


    /**
     * Testing xyzMiddle 
     */
    @Test
    void xyzMiddleTest1() throws IOException{
         assertTrue(Utility.xyzMiddle("AAxyzBB"));
    }
      /**
     * Testing xyzMiddle difference of one
     */

    @Test
    public void xyzMiddleTest2() throws IOException{
        assertTrue(Utility.xyzMiddle("AxyzBB"));
    }
          /**
     * Testing xyzMiddle with capital letters
     */
    
    @Test
    public void xyzMiddleTest3() throws IOException{
        assertFalse(Utility.xyzMiddle("AxyzBBB"));
    
    }
    /** 
     * Testing vowelCount with words
     */

    @Test
    public void vowelCountTest1() throws IOException{
        assertEquals("consectetur", Utility.vowelCount("/Users/jacky/github-classroom/SACHSTech/grade-11-review-2---methods-and-testing-anujan-oscar-jacky/src/gr11review/part2/words.txt"));

    }
    /** 
     * Testing vowelCount with no words
     */

    @Test
    public void vowelCountTest2() throws IOException{
        assertEquals("", Utility.vowelCount("/Users/jacky/github-classroom/SACHSTech/grade-11-review-2---methods-and-testing-anujan-oscar-jacky/src/gr11review/part2/nowords.txt"));
        
    }
    /** 
     * Testing vowelCount with random letters
     */

    @Test
    public void vowelCountTest3() throws IOException{
        assertEquals("oebideai", Utility.vowelCount("/Users/jacky/github-classroom/SACHSTech/grade-11-review-2---methods-and-testing-anujan-oscar-jacky/src/gr11review/part2/random.txt"));

    }

   /**
     * Arrays 1D - 3
     * four numbers
     */

    @Test
    void zeroFrontTest1() throws IOException {
       assertTrue(Arrays.equals(fourNumbers, Utility.zeroFront(fourNumbers)));

    }
    /**
     * Arrays 1D - 3
     * five numbers 
     */

    @Test
    void zeroFrontTest2() throws IOException {
       assertTrue(Arrays.equals(fiveNumbers, Utility.zeroFront(fiveNumbers)));
    }

    /**
     * Arrays 1D - 3
     * six numbers
     */

    @Test
    void zeroFrontTest3() throws IOException {
       assertTrue(Arrays.equals(sixNumbers, Utility.zeroFront(sixNumbers)));

    }

    /**
     * Arrays 1D - 3
     * two numbers
     */

    @Test
    void zeroFrontTest4() throws IOException {
       assertTrue(Arrays.equals(twoNumbers, Utility.zeroFront(twoNumbers)));
    }

    /**
     * seriesUp test 1
     * numbers up to 3
     */
    @Test
    public void seriesUpTest1() {

        int[] arrayExpected = {1, 1, 2, 1, 2, 3};
        assertArrayEquals(arrayExpected, Utility.seriesUp(3));
    }

     /**
     * seriesUp test 3
     * numbers up to 4
     */
    @Test
    public void seriesUpTest2() {

        int[] arrayExpected = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4};
        assertArrayEquals(arrayExpected, Utility.seriesUp(4));
    }

     /**
     * seriesUp test 3
     * numbers up to 2
     */
    @Test
    public void seriesUpTest3() {

        int[] arrayExpected = {1, 1, 2};
        assertArrayEquals(arrayExpected, Utility.seriesUp(2));
    }

    /**
     * seriesUp test 4
     * numbers up to 7
     */
    @Test
    public void seriesUpTest4() {

        int[] arrayExpected = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1 ,2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(arrayExpected, Utility.seriesUp(7));
    }

    /**
     * Arrays - 7
     * test if array is inversed
     */

    @Test
    void inverseTest1() throws IOException {
       assertArrayEquals(invertArrayEquals, Utility.invert(invertArray));

    }
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
