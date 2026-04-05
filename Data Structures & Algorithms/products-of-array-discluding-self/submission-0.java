class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length ; 
        int[] pre = new int[n];
        int[] post = new int[n];
        int[] comb = new int[n];


        // int n = nums.length ;
        for(int i = 0 ; i < n ; i++){
            int temp = 1 ; 
            int j = 0 ; 
            while (j < i ){
                temp *= nums[j];
                j+=1;
            }
            pre[i] = temp; 
            temp = 1 ; 

            for( int k = i+1 ; k< n ; k++){
                temp *= nums[k] ;
            }
            post[i] = (temp);
            temp =1 ;

            int x = pre[i] * post[i];
            comb[i] = x ;


        }
        return comb ;




        
    }
}  
