package com.fullstack.javacore.CollectionTopics.Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class TargettedSum {
    private static int[] nums;
    private static int target;

    public int[] twoSumIndices(int[] nums, int target) {
        this.nums = nums;
        this.target = target;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int targetvalue = target - nums[i];
            if (map.containsKey(targetvalue)) {
                return new int[]{map.get(targetvalue), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{ };
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 100;
        TargettedSum t=new TargettedSum();
        int[] twoindices = t.twoSumIndices(nums, target);
        System.out.println(Arrays.toString(twoindices));
    }
}