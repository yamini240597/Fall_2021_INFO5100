package edu.northeastern.malik_y;

import java.util.HashSet;
import java.util.*;

public class UniqueInteger {
    public static int findNonRepeated(int [] num) {
        for (int i = 0; i < num.length; i++) {
            int j; // global initialisation
            for (j = 0; j < num.length; j++) {
                if (i != j && num[i] == num[j]) {
                    break;
                }
            }
            if (j == num.length) {
                return num[i];
            }
        }
        return 0;
    }
}
