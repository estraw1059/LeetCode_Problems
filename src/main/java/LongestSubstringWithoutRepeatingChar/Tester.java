package LongestSubstringWithoutRepeatingChar;

public class Tester {

    public static void main(String args[]) {
        Solution solver = new Solution();
        //Test 1
        int result = solver.lengthOfLongestSubstring(" ");
        checkAnswer(1, result);
        result = solver.lengthOfLongestSubstring("abcabcbb");
        checkAnswer(3, result);
        result = solver.lengthOfLongestSubstring("ABCDEBFGHIJ");
        checkAnswer(9, result);
    }

    public static void checkAnswer(int answer, int result) {
        if (result != answer) {
            System.out.print("Incorrect");
        }
    }

}
