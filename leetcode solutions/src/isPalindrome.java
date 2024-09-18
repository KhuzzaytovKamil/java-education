//https://leetcode.com/problems/palindrome-number/
public class isPalindrome {
    isPalindrome(int x) {
        int startNum = x;
        int newNum = 0;
        int[] xAndRemains = {x, 0};

        while (xAndRemains[0] > 0) {
            xAndRemains = divmod(xAndRemains[0], 10);
            newNum = newNum * 10 + xAndRemains[1];
        }

        System.out.println(startNum == newNum);
    }

    private int[] divmod(int divisible, int divisor) {
        int[] result = {divisible / divisor, divisible % divisor};
        return result;
    }
}
