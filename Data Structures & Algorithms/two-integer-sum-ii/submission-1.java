class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int n  = numbers.length;
        int[] res = new int[2]; 
        // Array<Integer> res = new ArrayList<>();

        for (int i = 0 ; i<n-1 ; i++){
            for (int j = i ; j < n;  j++){
                if (numbers[i] + numbers[j] == target ){
                    if (i < j){
                    res[0] = i+1;
                    res[1] = j+1 ; 
                    }
                }
            }
        }
        return res ;



        
    }
}
