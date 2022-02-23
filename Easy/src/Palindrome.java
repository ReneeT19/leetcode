/*
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.
For example, 121 is palindrome while 123 is not.

Example 1:
Input: x = 121
Output: true
Example 2:
Input: x = -121
Output: false
 */

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        getPalindrome ob = new getPalindrome();
        System.out.println(ob.isPalindrome(22022022));
//        System.out.println(ob.isPalindrome(-121));
//        System.out.println(ob.isPalindrome(1000021));
    }
}

class getPalindrome {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int i = 0;
        while(i < str.length()) {
            if(str.charAt(i) == str.charAt(str.length() - (i+1))) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }
}

