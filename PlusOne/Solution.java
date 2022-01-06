import java.util.Arrays;

class Solution {
    public static int[] plusOne(int[] digits) {
        // Boolean added = false;
        int index = digits.length - 1;
        while (index >= 0) {
            
            if(digits[index] == 9) digits[index--] = 0;
            else{
                digits[index] += 1;
                break;
            } 
        }
        if (digits[0] == 0) digits = newArray(digits);
        return digits;
    }

    public static int[] newArray(int[] arr) {
        int[] result = new int[arr.length + 1];
        result[0] = 1;
        for (int i = 1; i < result.length; i++) {
            result[i] = arr[i - 1];
        }
        return result;
    }
    
    public static void main(String[] args){
        int test[] = new int[]{9, 9, 9, 9, 9, 9};
        int[] result = plusOne(test);
        System.out.println(Arrays.toString(result));
    }
}