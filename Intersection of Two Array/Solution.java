import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;



class Solution {
    public static int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        int[] chosen = nums1.length <= nums2.length ? nums1 : nums2; 
        int[] search = nums1.length <= nums2.length ? nums2 : nums1;
        ArrayList<Integer> temp = new ArrayList<>();

        for (int num: chosen) {
            if (map.containsKey(num)) {
                map.replace(num, map.get(num) + 1) ; continue;
            }
            map.put(num, 1);
        } 
        for (int num: search) {
            if (map.containsKey(num) && map.get(num) > 0) {
                map.replace(num, map.get(num) - 1);
                temp.add(num);
            }
        }

        int result[] = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] test = new int[]{1,2,2,1};
        int[] test2 = new int[]{2,2};
        int[] result = intersect(test, test2);
        System.out.println(Arrays.toString(result));

    }
}
