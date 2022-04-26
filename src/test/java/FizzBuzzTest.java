import com.titusnachbauer.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void NothingTest() {
    }

    @Test
    void FizzBuzz1ShouldReturn1() {
        assertEquals("1", fizzBuzz.get(1));
    }

    @Test
    void FizzBuzz2ShouldReturn2() {
        assertEquals("2", fizzBuzz.get(2));
    }

    @Test
    void FizzBuzz3ShouldReturn3() {
        assertEquals("Fizz", fizzBuzz.get(3));
    }

    @Test
    void FizzBuzz5ShouldReturn5() {
        assertEquals("Buzz", fizzBuzz.get(5));
    }

    @Test
    void FizzBuzz6ShouldReturnFizz() {
        assertEquals("Fizz", fizzBuzz.get(6));
    }
}

