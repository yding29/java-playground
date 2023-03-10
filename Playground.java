import java.util.*;

public class Playground {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max;
        if (height[left] < height[right]) {
            max = (right - left) * (height[left]);
        } else {
            max = (right - left) * (height[right]);
        }

        while (left < right) {
            if (height[left] <= height[left + 1] && height[right] <= height[right - 1]) {
                if (height[left] <= height[right]) {
                    left++;
                } else {
                    right--;
                }

            } else {
                if (height[left] <= height[left + 1]) {
                    left++;
                } else if (height[right] <= height[right - 1]) {
                    right--;
                } else {
                    if (height[left] <= height[right]) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
            if (height[left] > height[right] && max < height[right] * (right - left)) {
                max = height[right] * (right - left);
            } else if (height[left] > height[right] && max < height[left] * (right - left)) {
                max = height[left] * (right - left);
            }
        }
        return max;
    }

    public static double round(double number, int places) {
        // number is the number that we are rounding
        // places is the number of decimal places that we wish to reserve
        if (places == 0) {
            return (int) number;
        }
        double result;
        int product = 1;
        for (int i = 0; i < places; i++) {
            product *= 10;
        }
        int remainder = (int) (number * product % product);
        if (remainder >= 5) {
            result = (int) (number * product + 1) / (double) (product);
        } else {
            result = (int) (number * product) / (double) (product);
        }
        return result;
    }

    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return climbStairs(n-1) + climbStairs(n-2);
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
