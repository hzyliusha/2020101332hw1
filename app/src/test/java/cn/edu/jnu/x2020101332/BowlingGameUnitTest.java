package cn.edu.jnu.x2020101332;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {
    @Test
    public void test20Zeros() {
        BowlingGame game =new BowlingGame();
        for(int j=0;j<20;j++)
        {
            game.roll(0);
        }
                assertEquals(0,game.score());
    }
    @Test
    public void testAllOnes() {

    }
}