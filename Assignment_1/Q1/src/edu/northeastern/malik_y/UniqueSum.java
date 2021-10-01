package edu.northeastern.malik_y;

import java.util.HashMap;
import java.util.Map;

public class UniqueSum {
    public static int findUniqueSum(int[] nums) {
        boolean value =true;
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            value =true;
            for (int j = 0; j <nums.length; j++) {
                if (nums[i] == nums[j] && j!=i) {
                    value =false;
                    break;
                }
            }
            if(value ==true) {
                sum=sum+nums[i];
            }
        }
        return sum;
    }
}
