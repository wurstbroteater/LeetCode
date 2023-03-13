package easy;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1}));
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(removeDuplicates(new int[]{0, 1, 2}));
        System.out.println(removeDuplicates(new int[]{1, 1, 1, 2, 3}));
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        return removeDuplicates(nums, 1, nums[0]);
    }

    private static int removeDuplicates(int[] nums, int currentIndex, int lastNumber) {
        if (currentIndex >= nums.length) {
            return currentIndex;
        }
        //System.out.println();
        //System.out.println("Array: " + Arrays.toString(nums));
        //System.out.println("num[" + currentIndex + "]= " + nums[currentIndex] + ", lastRead: " + lastNumber);
        final int startIndex = currentIndex;
        int tempIndex = currentIndex;
        while (nums[tempIndex] <= lastNumber) {
            tempIndex++;
            if (tempIndex > nums.length - 1) {
                return currentIndex;
            }
        }
        lastNumber = nums[tempIndex];
        swap(nums, startIndex, tempIndex);
        currentIndex++;
        return removeDuplicates(nums, currentIndex, lastNumber);
    }

    private static void swap(int[] nums, int i1, int i2) {
        final int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }
}
