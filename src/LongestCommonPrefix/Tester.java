package LongestCommonPrefix;

public class Tester {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] input = {"ab", "a"};
        String answer = s.longestCommonPrefix(input);
        if (!answer.equals("a")) {
            System.out.println("Answer Incorrect");
        }
    }
}
