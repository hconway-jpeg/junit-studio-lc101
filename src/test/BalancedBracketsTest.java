package test;

import main.BalancedBrackets;
import org.junit.Test;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testTwo() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch]Code"));
    }

    @Test
    public void testThree() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }

    @Test
    public void testFour() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launc[hCode"));
    }

    @Test
    public void testFive() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void testSix() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("La]unchCode["));
    }

    @Test
    public void testSeven() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchC]ode"));
    }

    @Test
    public void testEight() {
        //
    }

    @Test
    public void testNine() {
        //
    }

    @Test
    public void testTen() {
        //
    }

    @Test
    public void testEleven() {
        //
    }

    @Test
    public void testTwelve() {
        //
    }

}
