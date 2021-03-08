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
}

