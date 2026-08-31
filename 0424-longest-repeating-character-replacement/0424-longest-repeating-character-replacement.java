//O(n) O(1)
class Solution {
    public int characterReplacement(String s, int k) {
    int left = 0;
    int maxfreq = 0;
    int maxlength = 0;
    int[] freq = new int[26];
    for(int right = 0;right < s.length();right++){
        int index = s.charAt(right) - 'A';
        freq[index]++;
        maxfreq = Math.max(maxfreq,freq[index]);
        int windowLength = right - left + 1;
        int replacement = windowLength - maxfreq;
        while(replacement > k){
            int leftindex = s.charAt(left) - 'A';
            freq[leftindex]--;
            left++;
            windowLength = right - left + 1;
            replacement = windowLength - maxfreq;
        }
        maxlength = Math.max(maxlength, windowLength);
    }
    return maxlength;  
    }
}