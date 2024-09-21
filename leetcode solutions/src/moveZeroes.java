public class moveZeroes {
    moveZeroes(int[] nums) {
        int[] newNum = new int[nums.length];
        int currentArraySize = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                newNum[currentArraySize] = nums[i];
                currentArraySize += 1;
            }
        }

        nums = newNum;

        System.out.print("[");
        
        System.out.print("]");
    }
}