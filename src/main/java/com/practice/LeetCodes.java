package com.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCodes {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 11, 15};
        LeetCodes obj = new LeetCodes();
        int output = obj.strStr("hello","ll");
        System.out.println(output);
    }

    public int romanToInt(String s) {
        int value = 0;
        int result = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            switch (c[i]) {
                case 'I':
                    value = 1;
                    break;
                case 'V':
                    value = 5;
                    break;
                case 'X':
                    value = 10;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'C':
                    value = 100;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;
            }
            if (i+1 < s.length()) {
                if (c[i] == 'I' && (c[i+1] == 'V' || c[i+1] == 'X')) {
                    result += value - 1;
                }
                if (c[i] == 'X' && (c[i + 1] == 'L' || c[i + 1] == 'C')) {
                    result += value - 10;
                }
                if (c[i] == 'C' && (c[i + 1] == 'D' || c[i + 1] == 'M')) {
                    result += value - 100;
                }
                else result += value;
            }
        }
        return result;
    }

    public int strStr(String haystack, String needle) {
    if(needle == null){
        return 0;
    }
    char s = needle.charAt(0);
    for(int i =0; i < haystack.length(); i ++){
        if(haystack.charAt(i) == s){
            String s2 = haystack.substring(i, needle.length()+i);
            if(s2.equals(needle)) {
                return i;
            }
                else {
                    s2 = "";
                }
            }
        }
    return -1;
     }
   }

