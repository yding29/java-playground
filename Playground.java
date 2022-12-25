import java.util.*;

public class Playground {
    public static void main(String[] args) {
        Student Johnson = new Student("Johnson");
        System.out.println(Johnson.returnName());
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
        return "";
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
