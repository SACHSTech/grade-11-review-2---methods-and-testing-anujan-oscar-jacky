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

}
