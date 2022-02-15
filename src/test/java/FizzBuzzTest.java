import com.titusnachbauer.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    @Test
    void NothingTest() {

    }

    @Test
    void FizzBuzz1ShouldReturn1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertEquals("1", fizzBuzz.get(1));
    }
}

