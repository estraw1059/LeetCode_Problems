package ValidParentheses;

public class Tester {
    public static void main(String[] args) {
        Solution s = new Solution();

        String input = "}{";
        boolean isFalse = s.isValid(input);
        if (!isFalse) {
            System.out.println("Not valid which is correct");
        }

    }
}
