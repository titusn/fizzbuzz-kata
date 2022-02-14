import com.titusnachbauer.fizzbuzz.FizzBuzz;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void NothingTest() {

    }

    @Test
    void FizzBuzz1ShouldBe1() {
        assertEquals("1", fizzBuzz.getAnswerFor(1));
    }

    @Test
    void FizzBuzz2ShouldBe2() {
        assertEquals("2", fizzBuzz.getAnswerFor(2));
    }

    @Test
    void FizzBuzz3ShouldBeFizz() {
        assertEquals("Fizz", fizzBuzz.getAnswerFor(3));
    }

    @Test
    void FizzBuzz5ShouldBeBuzz() {
        assertEquals("Buzz", fizzBuzz.getAnswerFor(5));
    }


}

