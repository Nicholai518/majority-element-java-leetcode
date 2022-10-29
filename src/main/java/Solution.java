import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        // only 1 numner in array
        if(nums.length == 1){
            return nums[0];
        }

        // used to store number within nums = key
        // frequency = value
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        // iterate through nums
        for(int i : nums){

            // if the number has already been added to map
            // and the current frequency + 1 (for current iteration)
            // is the majority, return this number
            if(map.containsKey(i) && map.get(i) + 1 > nums.length / 2 ){
                return i;
            }

            // this number / element has not been added to map yet
            // key = element
            // value = 0 by default, but we will add 1 to it
            // or
            // if it is in the map but isnt the majority element
            // add 1 to its value / accumulator
            else{
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }

        // if we make it to this point, return -1
        return -1;
    }
}
