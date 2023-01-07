import java.util.*;

public class Playground {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("abc");
        queue.add("d");
        queue.add("e");
        MyQueue myQueue = new MyQueue(queue);
        myQueue.print();

//        String s = "(]";
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            stack.push(s.charAt(i));
//        }
//        char temp = stack.peek();
//        while (stack.empty() == false) {
//            stack.pop();
//            if (temp == '[' && stack.peek() !=']') {
//                System.out.println("false");
//                break;
//            } else if (temp == '(' && stack.peek() !=')') {
//                System.out.println("False");
//                break;
//            } else if (temp == '{' && stack.peek() !='}') {
//                System.out.println("FALSE");
//                break;
//            }
//        }
        char c = 'c';

    }



    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return climbStairs(n-1) + climbStairs(n-2);
        }
    }

    public static int[] productExceptSelf (int nums[]) {
        /*
        * Given an array nums. Return an array res such that
        * res[i] equals to the product of every element of nums except nums[i]
        *  */
        int[] ans = new int[nums.length];
        int product = 1;
        int[] zeroes = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                product *= nums[i];
            } else {
                zeroes[index] = i;
                index++;
            }
        }
        System.out.println(index);
        for (int i = 0; i < ans.length; i++) {
            boolean is_zero = false;
            for (int j = 0; j < index; j++) {
                if (i == nums[j]) {
                    is_zero = true;
                    break;
                }
            }
            if (index > 0) {
                if (is_zero) {
                    ans[i] = product / nums[i];
                } else {
                    ans[i] = 0;
                }
            } else {
                ans[i] = product / nums[i];
            }
        }
        return ans;
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
