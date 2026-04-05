class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int left = 0 ; 
        int right = numbers.length -1 ;

        while((numbers[left] + numbers[right] != target) && (left < right )){
            int total = numbers[left] + numbers[right];
            if (total > target) {
                right -- ; 
            }
            else if (total == target ){
                return new int[]{left, right};

            }
            else {
                left++;
            }
        }
        return new int[]{left+1, right+1};
        
    }
}
