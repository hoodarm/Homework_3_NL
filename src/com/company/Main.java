package com.company;

public class Main {

    public static void main(String[] args) {
        int K = 0;
        int [] NUMS = {3,7,4};
        while (K< NUMS.length)
        {
            int L = 0;
            while (L< NUMS.length)
            {
                if (K!=L)
                    System.out.println(10*NUMS[K] + NUMS[L]);
                L++;
            }
            K++;
        }
    }
}
