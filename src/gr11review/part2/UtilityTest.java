package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import gr11review.part2.Utility;

import java.io.IOError;
import java.io.IOException;

public class UtilityTest{

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
        assertTrue(Utility.xyzMiddle("AxyzBBB"));
    
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
}
