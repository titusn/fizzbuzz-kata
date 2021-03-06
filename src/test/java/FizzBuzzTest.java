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

    @Test
    void given6ShouldReturnFizz() {
        assertEquals("Fizz", fizzBuzz.getAnswerFor(6));
    }

    @Test
    void given9ShouldReturnFizz() {
        assertEquals("Fizz", fizzBuzz.getAnswerFor(9));
    }

    @Test
    void given10ShouldReturnBuzz() {
        assertEquals("Buzz", fizzBuzz.getAnswerFor(10));
    }

    @Test
    void given15ShouldReturnFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.getAnswerFor(15));
    }

    @Test
    void given30ShouldReturnFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.getAnswerFor(30));
    }
}

