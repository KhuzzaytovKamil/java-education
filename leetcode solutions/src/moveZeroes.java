public class moveZeroes {
    moveZeroes(int[] nums) {
        int firstPointPosition = 0;
        int secondPointPosition = 0;
        int temporaryKeeper;

        while (firstPointPosition < nums.length - 1) {
            if (secondPointPosition < firstPointPosition) {
                secondPointPosition = firstPointPosition;
            }

            if (nums[firstPointPosition] == 0) {
                while (nums[secondPointPosition] == 0 && secondPointPosition < nums.length - 1) {
                    secondPointPosition ++;
                }

                temporaryKeeper = nums[firstPointPosition];
                nums[firstPointPosition] = nums[secondPointPosition];
                nums[secondPointPosition] = temporaryKeeper;
                firstPointPosition ++;
            }
            else {
                firstPointPosition ++;
            }
        }

        printNums(nums);
    }

    private void printNums(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1) {
                System.out.print(nums[i] + ", ");
            }
            else {
                System.out.print(nums[i]);
            }
        }
        System.out.println("]");
    }
}