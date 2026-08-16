class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int x:nums){
            if(!s.add(x)) return true;
        }
        return false;
    }
}