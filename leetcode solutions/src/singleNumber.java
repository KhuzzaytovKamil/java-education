public class singleNumber {
    singleNumber(int[] nums) {
        int[] temporaryNums = new int[2];
        temporaryNums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            temporaryNums[1] = nums[i];
            temporaryNums[0] = xor(temporaryNums);
        }
        System.out.print(temporaryNums[0]);
    }

    private int xor(int[] n) {
        System.out.println(n[0]);
        System.out.println(n[1]);
        int[] ansInBin = new int[15];
        int ans = 0;

        int[] n1InBin = new int[15];
        int[] n2InBin = new int[15];
        int i = 0;

        while (n[0] > 0) {
            n1InBin[i] = n[0] % 2;
            n[0] = n[0] / 2;
            i ++;
        }

        i = 0;
        while (n[1] > 0) {
            n2InBin[i] = n[1] % 2;
            n[1] = n[1] / 2;
            i ++;
        }

        for (i = 0; i < 15; i ++) {
            System.out.print(n1InBin[i]);
        }
        System.out.println(' ');
        for (i = 0; i < 15; i ++) {
            System.out.print(n2InBin[i]);
        }
        System.out.println(' ');
        System.out.println(' ');

        for (i = 0; i < 15; i ++) {
            if (n1InBin[i] == n2InBin[i]) {
                ansInBin[i] = 0;
            }
            else {
                ansInBin[i] = 1;
            }
            ans += ansInBin[i] * Math.pow(2, i);
        }

        return ans;
    }
}
