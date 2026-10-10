import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }
    
    private void backtrack(int start, int[] nums, List<Integer> currentSubset, List<List<Integer>> result) {
        // Add a copy of the current subset to the result
        result.add(new ArrayList<>(currentSubset));
        
        for (int i = start; i < nums.length; i++) {
            // Include nums[i]
            currentSubset.add(nums[i]);
            // Move on to the next element
            backtrack(i + 1, nums, currentSubset, result);
            // Backtrack by removing the element
            currentSubset.remove(currentSubset.size() - 1);
        }
    }
}