package cn.edu.jnu.x2020101332;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {

    private BowlingGame game;

    @Before
    public void setUp() throws Exception {
        game = new BowlingGame();
    }

    @Test
    public void test20Zeros() {
        repeatedRoll(0, 20);
        assertEquals(0, game.score());
    }
    @Test
    public void testAllOnes() {
        repeatedRoll(1,20);
        assertEquals(20, game.score());
    }

    @Test
    public void testOneSpare() {
        rollSpare();
        game.roll(3);
        repeatedRoll(0,17);
        assertEquals(16, game.score());
    }
    @Test
    public void testOneSrick() {
    }

    private void rollSpare() {
        game.roll(2);
        game.roll(8);
    }

    private void repeatedRoll(int pin, int times) {
        for(int j=0;j<times;j++)
        {
            game.roll(pin);
        }
    }
}