import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = -1;
        int key = 0;

        for (int num : nums) {
            map.put(num, 0);
        }

        for (int num : nums){
            map.put(num, map.get(num) + 1);
        }

        for ( int value : map.values() ) {
            if (value > max)
                max = value;
        }

        for ( int keye : map.keySet() ) {
            if (map.get(keye) == max)
                key = keye;

        }
        return key;

    }
}