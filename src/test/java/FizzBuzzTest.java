import com.titusnachbauer.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void given1ShouldReturn1() {
        assertEquals("1", fizzBuzz.getAnswerFor(1));
    }

    @Test
    void given2ShouldReturn2() {
        assertEquals("2", fizzBuzz.getAnswerFor(2));
    }

    @Test
    void given3ShouldReturnFizz() {
        assertEquals("Fizz", fizzBuzz.getAnswerFor(3));
    }

    @Test
    void given4ShouldReturn4() {
        assertEquals("4", fizzBuzz.getAnswerFor(4));
    }

    @Test
    void given5ShouldReturnBuzz() {
        assertEquals("Buzz", fizzBuzz.getAnswerFor(5));
    }
}

