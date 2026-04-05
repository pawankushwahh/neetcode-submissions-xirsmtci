class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set <Integer> st  = new HashSet<>();
        int n = nums.length ; 


        for (int i =0 ; i < n ; i++ ){
            st.add(nums[i]);
        }
        int m = st.size(); 

        if (m==n){
            return false ;
        }

        else {
            return true ; 
        }

        
    }
}