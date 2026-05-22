class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List< List<Integer>> result = new ArrayList<>(); 
        backtrack(nums, 0 , new ArrayList<>(), result ); 
        return result ; 
         
    }

    void backtrack(int[] nums ,int start, List<Integer>subsets , List<List<Integer>> result ){

        result.add(new ArrayList<>(subsets)); 
        
        for(int i = start ; i < nums.length ; i++ ){
                                                                                    
            subsets.add(nums[i]) ; 
            backtrack(nums, i+1 , subsets, result ); 
            subsets.remove(subsets.size() - 1); 
        }
    }
}
