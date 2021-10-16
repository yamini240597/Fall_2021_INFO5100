package edu.northeastern.malik_y;

import java.util.Arrays;

public class MoveZeroes {
    public static int[] shiftZero(int[] nums){
        int temp = 0;
        int n = nums.length;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums [i] == 0){
                for(int j = i+1; j < nums.length; j++)
                {
                    if(nums [j]!=0)
                    {
                        temp = nums [i];
                        nums [i] =nums [j];
                        nums [j] = temp;
                        break;
                    }
                }
            }
        }
        return nums;
    }

    public static void printDetails(int[]nums){
        System.out.println("The input array is: " + Arrays.toString(nums));
        //output
        System.out.println("The output after shifting zereos: " + Arrays.toString(MoveZeroes.shiftZero(nums)));
        System.out.println();
    }
}
