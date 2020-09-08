package test;
import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void bracketsWithTextInMiddle(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void bracketsStartInMiddleOfText() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void bracketsFollowedByText() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void emptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void openBracketFollowedByTextNoClose() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void TextCloseBracketTextOpenBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void openBracketNoClose() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void closeBracketOpenBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void nestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void deepnestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[ [][[[]]]]]]"));
    }

    @Test
    public void textOnlyNoBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }


}

