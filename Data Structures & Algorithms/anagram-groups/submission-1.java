class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();
        for(String x:strs){
            int[] freq=new int[26];
            for(char c:x.toCharArray()) freq[c-'a']++;
            String key=Arrays.toString(freq);
            mp.putIfAbsent(key,new ArrayList<>());
            mp.get(key).add(x);
        }
        List<List<String>> res=new ArrayList<>();
        for(List<String> x:mp.values()) res.add(x);
        return res;
    }
}
