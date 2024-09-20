public class findMaxAverage {
    findMaxAverage(int[] nums, int k) {
        double curSum = 0;

        for (int i = 0; i < k; i++) {
            curSum += nums[i];
        }

        double minSum = curSum;

        for (int i = k; i < nums.length; i++) {
            curSum += nums[i];
            curSum -= nums[i - k];

            minSum = Math.max(minSum, curSum);
        }

        System.out.println(minSum / k);
    }
}
