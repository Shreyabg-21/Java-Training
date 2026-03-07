package Day9.dsa.backTracking;
import java.util.ArrayList;
import java.util.List;
public class Solution {

    private void solve(int[] nums, List<Integer> output,
                       int index, List<List<Integer>> ans){
        if(index >= nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }

        solve(nums, output, index+1, ans);
        output.add(nums[index]);
        solve(nums, output, index+1, ans);
        output.remove(output.size()-1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums, output, index, ans);
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,3};
        List<List<Integer>> result = solution.subsets(nums);
        for (List<Integer> subset : result){
            System.out.println(subset);
        }
    }
}