package edu.northeastern.malik_y;

import java.util.Arrays;

public class Squares {
    public static void findSquares(int [] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums [i] = nums [i] * nums [i];
        }
        Arrays.sort(nums);
    }
}
