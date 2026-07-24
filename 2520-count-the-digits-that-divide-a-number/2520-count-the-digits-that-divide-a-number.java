class Solution {
    public int countDigits(int num) {
        int count = 0;
        int val = num;
        while(val != 0){
            int lastNum = val % 10;
            val = val / 10;
            if(num % lastNum == 0){
                count++;
            }
        }
        return count;
    }
}