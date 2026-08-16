class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();
        for(String x:strs){
            char[] ca=x.toCharArray();
            Arrays.sort(ca);
            String key=new String(ca);
            mp.putIfAbsent(key,new ArrayList<>());
            mp.get(key).add(x);
        }
        List<List<String>> res=new ArrayList<>();
        for(List<String> x:mp.values()) res.add(x);
        return res;
    }
}
