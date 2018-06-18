import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Evaluation {

    @Test
    public void shouldReturnValid() {
        List<String> testCases = Arrays.asList(
                "",
                "()",
                "[]",
                "()[]",
                "([])",
                "[()()]",
                "((([()()])))"
        );

        for (String testCase: testCases) {
            Assert.assertTrue(Solution.isValid(testCase));
        }
    }

    @Test
    public void shouldReturnInvalid() {
        List<String> testCases = Arrays.asList(
                null,
                ")(",
                "][",
                "(]",
                "((()])",
                "()[()()(])"
        );

        for (String testCase: testCases) {
            Assert.assertFalse(Solution.isValid(testCase));
        }
    }

}
