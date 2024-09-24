public class plusOne {
    plusOne(int[] digits) {
        digits = solution(digits, digits.length - 1);
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
    }

    private int[] solution(int[] digits, int index) {
        System.out.println(index);
        int[] result = null;
        if (index < 0) {
            result = new int[digits.length + 1];
            result[0] = 1;
            System.out.println("increase size of array case");
            return result;
        }
        else {
            digits[index] ++;
            if (digits[index] == 10) {
                digits[index] = 0;
                solution(digits, index - 1);
            }
            System.out.println("standard case");
            return digits;
        }
    }
}
