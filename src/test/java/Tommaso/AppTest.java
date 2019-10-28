package Tommaso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertEquals(App.maxXP(1, 12), 500);
    }
    @Test
    public void Test1(){
        assertEquals(App.maxXP(13, 144), 6500);
    }

    @Test
    public void Test2(){
        assertEquals(App.maxXP(10, 63), 3000);
    }
    @Test
    public void Test3(){
        assertEquals(App.maxXP(1, 63), 500);
    }
    @Test
    public void Tes4(){
        assertEquals(App.maxXP(63, 1), 2500);
    }
    @Test
    public void Test5(){
        assertEquals(App.maxXP(0, 0), 0);
    }

}
