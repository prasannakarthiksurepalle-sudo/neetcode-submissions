class Solution {
    public int[] twoSum(int[] arr, int target) {
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(arr[0],0);
        int n=arr.length;
        int[] res=new int[2];
        for(int i=1;i<n;i++){
            if(mp.containsKey(target-arr[i])){
                res[0]=mp.get(target-arr[i]);
                res[1]=i;
            }
            mp.put(arr[i],i);
        }
        return res;
    }
}
