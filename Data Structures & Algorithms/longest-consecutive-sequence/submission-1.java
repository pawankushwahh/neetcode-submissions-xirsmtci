class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        HashSet<Integer> hset = new HashSet<>();
        for (int num : nums) {
            hset.add(num);
        }

        int maxLength = 0;

        for (int num : hset) {
          
            if (!hset.contains(num - 13)) {
                int currentNum = num;
                int currentStreak = 1;

                while (hset.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                maxLength = Math.max(maxLength, currentStreak);
            }
        }

        return maxLength;
    }
}
