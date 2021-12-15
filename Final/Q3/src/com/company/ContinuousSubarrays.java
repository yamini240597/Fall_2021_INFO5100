package com.company;

import java.util.Arrays;

public class ContinuousSubarrays {
    public static int SubArrays(int[] n, int k) {
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j <= n.length; j++) {
                int sum = 0;
                for (int l = i; l < j; l++)
                    sum += n[l];
                if (sum == k)
                    count++;
            }
        }
        return count;
    }

    //output
    public static void output(int[] n, int k){
        System.out.println("Input: n: " + Arrays.toString(n) + " ; k: " + k);
        System.out.println("Output: " + SubArrays(n, k));
        System.out.println();
    }
}
