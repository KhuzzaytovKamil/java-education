import java.util.*;

public class containsDuplicate {
    containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        Integer[] newArr = set.toArray(new Integer[set.size()]);
        System.out.println(nums.length != newArr.length);
    }
}
