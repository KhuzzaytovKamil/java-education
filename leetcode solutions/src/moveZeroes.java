public class moveZeroes {
    moveZeroes(int[] nums) {
        int firstPointPosition = 0;
        int secondPointPosition = 0;
        int temporaryKeeper;
//        System.out.print(firstPointPosition + " ");
//        printNums(nums);

        while (firstPointPosition < nums.length - 2) {
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
//            System.out.print(firstPointPosition + " ");
//            printNums(nums);
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