class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Character, Integer> maps = new HashMap<>();
        HashMap<Character, Integer> windowH = new HashMap<>();
        for(char ch : p.toCharArray()){
            maps.put(ch, maps.getOrDefault(ch,0) + 1);
        }
        int left = 0;
        for(int right = 0;right<s.length();right++){
            char ch = s.charAt(right);
            windowH.put(ch, windowH.getOrDefault(ch, 0) + 1);
            if(right - left + 1 > p.length()){
                char remove = s.charAt(left);
                windowH.put(remove,windowH.get(remove) - 1);
                if(windowH.get(remove) == 0){
                    windowH.remove(remove);
                }
                left++;
            }
            if(windowH.equals(maps)){
                ans.add(left);
            }
        }
        return ans;
    }
}