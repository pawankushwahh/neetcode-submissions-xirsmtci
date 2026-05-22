class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length ; 
        HashMap<Integer , Integer> hmap = new HashMap<>(); 

        for (int i = 0 ; i < n ; i++){
            int x = target - nums[i]; 
            

            if(hmap.containsKey(x)){
                return new int[]{hmap.get(x), i }; 
            }
            else {
                hmap.put(nums[i], i ); 
            }
        
        }
        return new int[]{-1,-1}; 
    }
}
