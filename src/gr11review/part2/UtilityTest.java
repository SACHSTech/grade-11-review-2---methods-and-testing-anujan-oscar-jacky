package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import gr11review.part2.Utility;

import java.io.IOError;
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
     * 
     * @author J. Wang
     */
    @Test
    void xyzMiddleTest1() throws IOException{
         assertTrue(Utility.xyzMiddle("AAxyzBB"));
    }
      /**
     * Testing xyzMiddle difference of one
     * 
     * @author J. Wang
     */
    @Test
    public void xyzMiddleTest2() throws IOException{
        assertTrue(Utility.xyzMiddle("AxyzBB"));
    }
          /**
     * Testing xyzMiddle capital
     * 
     * @author J. Wang
     */
    
    @Test
    public void xyzMiddleTest3() throws IOException{
        assertFalse(Utility.xyzMiddle("AxyzBBB"));
    
    }
    /** 
     * Testing vowelCountTest1 with words
     */

    public void vowelCountTest1() throws IOException{
        assertEquals("words", Utility.vowelCount("/Users/jacky/github-classroom/SACHSTech/grade-11-review-2---methods-and-testing-anujan-oscar-jacky/src/gr11review/part2/words.txt"));

    }
    /** 
     * Testing vowelCountTest2 with no words
     */

    public void vowelCountTest2() throws IOException{
        assertEquals("nowords", Utility.vowelCount("/Users/jacky/github-classroom/SACHSTech/grade-11-review-2---methods-and-testing-anujan-oscar-jacky/src/gr11review/part2/nowords.txt"));
        
    }
    /** 
     * Testing vowelCountTest3 with random letters
     */

    public void vowelCountTest3() throws IOException{
        assertEquals("random", Utility.vowelCount("/Users/jacky/github-classroom/SACHSTech/grade-11-review-2---methods-and-testing-anujan-oscar-jacky/src/gr11review/part2/random.txt"));

    }

    /** 
     * Testing vowelCountTest4 with letters
     */

    public void vowelCountTest4() throws IOException{
        assertEquals("letters", Utility.vowelCount("/Users/jacky/github-classroom/SACHSTech/grade-11-review-2---methods-and-testing-anujan-oscar-jacky/src/gr11review/part2/letters.txt"));


    }
   /**
     * Arrays 1D - 3
     * four numbers
     */

    @Test
    void zeroFrontTest1() throws IOException {
       assertArrayEquals(fourNumbers, Utility.zeroFront(fourNumbers));

    }
    /**
     * Arrays 1D - 3
     * five numbers 
     */

    @Test
    void zeroFrontTest2() throws IOException {
       assertArrayEquals(fiveNumbers, Utility.zeroFront(fiveNumbers));
    }

    /**
     * Arrays 1D - 3
     * six numbers
     */

    @Test
    void zeroFrontTest3() throws IOException {
       assertArrayEquals(sixNumbers, Utility.zeroFront(sixNumbers));

    }

    /**
     * Arrays 1D - 3
     * two numbers
     */

    @Test
    void zeroFrontTest4() throws IOException {
       assertArrayEquals(twoNumbers, Utility.zeroFront(twoNumbers));
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
     * Arrays - 7
     * test if array is inversed
     */

    @Test
    void inverseTest1() throws IOException {
       assertArrayEquals(invertArrayEquals, Utility.invert(invertArray));

    }
}



