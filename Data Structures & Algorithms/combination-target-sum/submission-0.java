class Solution {
    
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result, target);
        return result;
    }

    void backtrack(int[] nums, int start, List<Integer> subset,
                   List<List<Integer>> result,
                   int target) {

        if (target == 0) {
            result.add(new ArrayList<>(subset));
            return;
        }

        if (target < 0) return;

        for (int i = start; i < nums.length; i++) {

            subset.add(nums[i]);
            backtrack(nums, i, subset, result, target - nums[i]);

            subset.remove(subset.size() - 1);
        }
    }
}