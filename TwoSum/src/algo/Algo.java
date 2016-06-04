package algo;

import java.util.*;

public class Algo {

    public static int[] list = {10, 20, 17, 30, 5};
    
    public static int target = 35;
    
    public int[] twoSumBrute(int[] nums, int target) {
        // Brute force method
        // O(n^2) Time
        // O(1)   Space
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    
    public static int[] twoSum(int nums[], int target) {
        // Two-pass Hash Table method
        // O(n) Time
        // O(n) Space (Sacrifice Space for time)       
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
                
        for (int i = 0; i < nums.length; i++) {
            int compl = target - nums[i];
            if (map.containsKey(compl) && map.get(compl) != i) {
                return new int[] { i, map.get(compl) };
            }
        }
        
        throw new IllegalArgumentException("No two sum solution");
    }
    
    public static int[] twoSum2(int nums[], int target) {
        // One-pass Hash Table method
        // O(n) Time
        // O(n) Space (Sacrifice space for time)
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int compl = target - nums[i];
            if (map.containsKey(compl)) {
                return new int[] { map.get(compl), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solutions");
    }
    
    public static void main(String[] args) {        
        System.out.println(Arrays.toString(twoSum(list, target)));        
        System.out.println(Arrays.toString(twoSum2(list, target)));
    }
    
}
