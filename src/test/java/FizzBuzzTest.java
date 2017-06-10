import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void fizzbuzz_21_FizzKiss(){
        String ans = FizzBuzz.getnum(21);
        assertEquals("FizzKiss",ans);
    }
    @Test
    public void fizzbuzz_15_FizzBuzz(){
        String ans = FizzBuzz.getnum(15);
        assertEquals("FizzBuzz",ans);
    }
    @Test
    public void fizzbuzz_14_Kiss(){
        String ans = FizzBuzz.getnum(14);
        assertEquals("Kiss",ans);
    }
    @Test
    public void fizzbuzz_10_Buzz(){
        String ans = FizzBuzz.getnum(10);
        assertEquals("Buzz",ans);
    }
    @Test
    public void fizzbuzz_9_Fizz(){
        String ans = FizzBuzz.getnum(9);
        assertEquals("Fizz",ans);
    }
    @Test
    public void fizzbuzz_7_Kiss(){
        String ans = FizzBuzz.getnum(7);
        assertEquals("Kiss",ans);
    }
    @Test
    public void fizzbuzz_6_Fizz(){
        String ans = FizzBuzz.getnum(6);
        assertEquals("Fizz",ans);
    }
    @Test
    public void fizzbuzz_1_1(){
        String ans = FizzBuzz.getnum(1);
        assertEquals("1",ans);
    } @Test
    public void fizzbuzz_2_2(){
        String ans = FizzBuzz.getnum(2);
        assertEquals("2",ans);
    } @Test
    public void fizzbuzz_3_Fizz(){
        String ans = FizzBuzz.getnum(3);
        assertEquals("Fizz",ans);
    }
    @Test
    public void fizzbuzz_4_4(){
        String ans = FizzBuzz.getnum(4);
        assertEquals("4",ans);
    } @Test
    public void fizzbuzz_5_buzz(){
        String ans = FizzBuzz.getnum(5);
        assertEquals("Buzz",ans);
    }

}
