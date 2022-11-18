package com.ramsay.exercises.novemberninth;
// Coding Bat Exercise: https://codingbat.com/prob/p168357

public class HasSeven {
    public static void main (String [] args) {
        HasSeven has77 = new HasSeven();
        int [] nums = {1, 7, 1, 1, 7};
        System.out.println(has77.hasSeven(nums));
    }

    public boolean hasSeven (int [] nums){
        boolean result = false;
        for (int i = 0; i < nums.length-2; i++) {
            if ((nums[i] == 7) && (nums[i+1] == 7)) {
                result = true;
            }
            else if ((nums[i] == 7) && (nums[i+2] == 7)) {
                result = true;
            }
            else {
                result = false;
            }
        }
      return result;
    }
}
