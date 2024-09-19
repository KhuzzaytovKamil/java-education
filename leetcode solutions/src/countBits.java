public class countBits {
    countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            result[i] = count_1_inBin(i);
        }
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            if (i != result.length - 1) {
                System.out.print(result[i] + ", ");
            }
            else {
                System.out.print(result[i]);
            }
        }
        System.out.print("]");
    }

    private int count_1_inBin(int n) {
        int numberOf1 = 0;
        while (n > 0) {
            numberOf1 += n % 2;
            n = n / 2;
        }
        return numberOf1;
    }
}
