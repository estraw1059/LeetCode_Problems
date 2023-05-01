package ValidParentheses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTester {
    Solution s = new Solution();


    @Test
    public void basicCorrectSolution() {
        String input = "[{[()]}]";
        boolean result = s.isValid(input);
        assertEquals(result, true);
    }

}
