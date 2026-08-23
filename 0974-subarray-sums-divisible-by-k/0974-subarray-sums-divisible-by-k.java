class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       HashMap<Integer, Integer> map = new HashMap<>();
       int prefixsum = 0;
       int count = 0;
       map.put(0,1);
       for(int num:nums){
       prefixsum = prefixsum + num;
       int remainder = prefixsum%k;
       if(remainder < 0){
        remainder = remainder + k;
       }
       if(map.containsKey(remainder)){
        count = count + map.get(remainder);
       }
       map.put(remainder, map.getOrDefault(remainder, 0)+1);
       }
       return count;
    }
}