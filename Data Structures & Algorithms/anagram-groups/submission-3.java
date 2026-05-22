class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> amap = new HashMap<>(); 

        for(String key : strs){
            
            char[] sortedkey = key.toCharArray(); 
            Arrays.sort(sortedkey); 

            String skey = new String(sortedkey); 

            if(!amap.containsKey(skey)){
                amap.put(skey, new ArrayList<>());
            }
            amap.get(skey).add(key); 
        }
        return new ArrayList<>(amap.values());

        
    }
}
