public class isPerfectSquare {
    isPerfectSquare(int num) {
        System.out.println(solution(num));
    }

    private boolean solution(int num) {
        long left = 1;
        long right = num / 2;
        long middle;
        long sqrtFromMiddle;

        if (num == 1) {
            return true;
        }

        while (left <= right) {
            middle = (left +right) / 2;
            sqrtFromMiddle = middle * middle;

            if (sqrtFromMiddle == num) {
                return true;
            }

            if (sqrtFromMiddle < num) {
                left = middle + 1;
            }
            else {
                right = middle - 1;
            }

        }
        return false;
    }
}
