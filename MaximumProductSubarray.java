package DSAPractice;

import java.util.Scanner;

public class MaximumProductSubarray {

    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};

        int result = maxProduct(nums);

        System.out.println("The maximum product of any subarray is: " + result);
    }

    public static int maxProduct(int[] nums) {
        int prefix = 1;
        int suffix = 1;
        int res = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (prefix == 0) {
                prefix = 1;
            }
            if (suffix == 0) {
                suffix = 1;
            }

            prefix *= nums[i];
            suffix *= nums[nums.length - i - 1];
            res = Math.max(res, Math.max(prefix, suffix));
        }

        return res;
    }
}
