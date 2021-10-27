package edu.northeastern.malik_y;

import java.util.Arrays;

public class SumRepeated {
        public static int sumOfRepeated(int[] nums) {
            boolean value = true;
            int sum = 0;
            int total = 0;

            for(int i = 0; i < nums.length; i++){
                total += nums[i];
            }

            for (int i = 0; i < nums.length; i++){
                value =true;
                for (int j = 0; j <nums.length; j++) {
                    if (nums[i] == nums[j] && j!=i) {
                        value =false;
                        break;
                    }
                }
                if(value ==true) {
                    sum += nums[i];
                }
            }
            return (total - sum)/2;
        }

    public static void printOutput(int[] nums){
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + sumOfRepeated(nums));
        System.out.println();
    }
}
