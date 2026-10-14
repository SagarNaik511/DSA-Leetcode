class Solution {
    public boolean isPerfectSquare(int num) {
    int left = 1;
    int right = num;
    while(left <= right){
        int mid = left + (right - left)/2;
        if(num % mid == 0 && num / mid == mid){
            return true;
        }else if(num/mid < mid){
            right = mid - 1;
        }else{
            left = mid + 1;
        }
    } 
    return false;
    }
}