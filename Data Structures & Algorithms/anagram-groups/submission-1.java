class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
 
            String sortedkey = new String(arr);
            if (!map.containsKey(sortedkey)){
                map.put(sortedkey,new ArrayList<>()) ;
                // map.put(sortedkey,new ArrayList()) ;   without "<>" will also work 

            }

            map.get(sortedkey).add(s);

        }
        return new ArrayList<>(map.values());
    
    }
}
