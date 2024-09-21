public class addDigits {
    addDigits(int num) {
        int curNum = 0;

        while (num > 9) {
            curNum = 0;
            while (num > 0) {
                curNum += num % 10;
                num = num / 10;
            }
            num = curNum;
        }

        System.out.println(curNum);
    }
}
