import static org.junit.jupiter.api.Assertions.assertEquals;

import com.titusnachbauer.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    @Test
    void NothingTest() {

    }

    @Test
    void FizzBuzz1ShouldBe1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.getAnswerFor(1));
    }

    @Test
    void FizzBuzz2ShouldBe2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("2", fizzBuzz.getAnswerFor(2));
    }

    @Test
    void FizzBuzz3ShouldBeFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.getAnswerFor(3));
    }
}

