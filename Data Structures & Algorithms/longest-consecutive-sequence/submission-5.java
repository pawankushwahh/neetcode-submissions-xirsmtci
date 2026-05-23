class Solution {
    public int longestConsecutive(int[] nums) {
        // if(nums == null || nums.lenght == 0 ){
        //     return 0 ; 
        // }

        int longest = 0 ; 

        Set<Integer> hset = new HashSet<>(); 
        for(int num : nums){
            hset.add(num); 
        }
        for(int num : hset ){
 
            if (!hset.contains(num-1 )){
                int length = 1 ; 
                while(hset.contains(num + length)){
                    length +=1  ; 
                }
                longest = Math.max(length, longest);
            }
        }
        return longest ; 
    }
}
