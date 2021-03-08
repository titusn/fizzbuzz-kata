import com.titusnachbauer.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    @Test
    void given1ShouldReturn1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertEquals("1", fizzBuzz.getAnswerFor(1));
    }
}
