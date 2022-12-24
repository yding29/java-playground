import java.util.*;

public class Playground {
    public static void main(String[] args) {
        String s = "pwwkew";
        String[] strs = new String[100]; // stores non-repeating substrings in string s
        int index = 0; // index of the array strs
        String substring = "";
        boolean equals = false;

        for ()

        for (int i = 0; i < strs.length; i++) {
            if (strs[i] != null) {
                System.out.println(strs[i]);
            }
        }
    }

    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return climbStairs(n-1) + climbStairs(n-2);
        }
    }

    public static String longestSubstring(String s) {
        // return the longest substring that string s has
        String[] strs = new String[100]; // stores non-repeating substrings in string s
        int index = 0; // index of the array strs
        String substring = s.substring(0, 1);
        boolean equals = false;
        for (int i = 0; i < s.length(); i++) {
            if (equals) {
                equals = false;
                strs[index] = substring;
                index++;
                substring = s.substring(i, i+1);
                continue;
            }
            for (int j = 0; j < substring.length(); j++) {
                if (s.substring(i, i+1).equals(substring.substring(j, j+1))) {
                    equals = true;
                    break;
                }
            }
            if (equals == false) {
                substring += s.substring(i, i+1);
            }
        }
        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i] != null) {
                if (strs[i].length() > res.length()) {
                    res = strs[i];
                }
            }
        }
        return res;
    }

    public int fibonacci(int n) {
        // printing the nth term of fibonacci sequence without using recursion
        int sum = 0;
        int num1 = 1;
        int num2 = 1;
        for (int i = 0; i < n; i++) {
            sum = num1 + num2;
            num1 = sum - num1;
            num2 = sum;
            System.out.println(sum + " " + num1 + " " + num2);
        }
        return sum;
    }

    public int fibonacci_rec(int n) {
        // printing the nth term of fibonacci sequence with recursion
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fibonacci_rec(n-1) + fibonacci_rec(n-2);
        }
    }

    public static String decapitalize(String input) {
        // Decapitalize every letter in one String
        String output = "";
        for (int index = 0; index < input.length(); index++) {
            if ((int)input.charAt(index) >= 65 && (int)input.charAt(index) <= 90) {
                char temp = (char)((int)input.charAt(index) + 32); // decapitalize
                output += Character.toString(temp);
            } else {
                output += input.substring(index, index+1);
            }
        }
        return output;
    }

}
