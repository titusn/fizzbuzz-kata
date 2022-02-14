import com.titusnachbauer.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Test;

class FizzBuzzApprovalTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void givenValues1to100ShouldReturnApprovedValues() {
        Integer[] values = new Integer[100];
        for (int i = 0; i < 100 ; i++) {
            values[i] = i + 1;
        }
//        Approvals.verifyAll(values, fizzBuzz::getAnswerFor);
    }

}
