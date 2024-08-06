import java.util.Arrays;

class Solution{
    public static int[] solution(int[] arr, int k) {

        for (int i = 0; i < arr.length; i++) {
            if (k <= 0) break;

            int minPos = -1;
            int min = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (j - i > k) break;
                if (arr[j] < min) {
                    min = arr[j];
                    minPos = j;
                }
            }

            for (int j = minPos; j > i; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }

            k -= minPos - i;
        }

        return arr;
    }

    public static void main (String args[]) {
        int[] sol = solution(new int[] {5,3,1}, 2);
        System.out.println(Arrays.toString(sol));
    }



}