package hw;

import org.junit.Test;

import static org.junit.Assert.*;

public class fizzBuzzTest {

    @Test(expected = NegativeArraySizeException.class)
    public void fizzBuzzArrayNegTen() {
        fizzBuzz.fizzBuzzArray(-10);
    }


    @Test(expected = NegativeArraySizeException.class)
    public void fizzBuzzArrayNegOne() {
        fizzBuzz.fizzBuzzArray(-1);
    }

    @Test
    public void fizzBuzzArrayZero()
    {
        String[]test= fizzBuzz.fizzBuzzArray(0);
        String[]test2 = {};
        assertArrayEquals(test2,test);
    }

    @Test
    public void fizzBuzzArrayOne()
    {
       String[]test= fizzBuzz.fizzBuzzArray(1);
        String[]test2 = {"1"};
        assertArrayEquals(test2,test);
    }

    @Test
    public void fizzBuzzArraySeven()
    {
        String[]test= fizzBuzz.fizzBuzzArray(7);
        String[]test2 = {"1", "2", "fizz", "4", "buzz", "fizz", "7"};
        assertArrayEquals(test2,test);
    }

    @Test
    public void fizzBuzzArraySeventeen()
    {
        String[]test= fizzBuzz.fizzBuzzArray(17);
        String[]test2 = {"1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14","fizz buzz", "16", "17"};
        assertArrayEquals(test2,test);
    }
}