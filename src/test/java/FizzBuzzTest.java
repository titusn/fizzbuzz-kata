import com.titusnachbauer.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    @Test
    void NothingTest() {

    }

    @Test
    void FizzBuzz1ShouldReturn1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.get(1));
    }

    @Test
    void FizzBuzz2ShouldReturn2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("2", fizzBuzz.get(2));
    }
}

