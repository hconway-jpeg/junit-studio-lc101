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
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void testNine() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]["));
    }

    @Test
    public void testTen() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void testEleven() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]"));
    }

    @Test
    public void testTwelve() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }

}
