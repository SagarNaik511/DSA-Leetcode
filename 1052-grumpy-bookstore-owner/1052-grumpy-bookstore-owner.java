class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
      int num = 0;
      int[] arr = new int[customers.length];
      for(int i=0;i<customers.length;i++){
        if(grumpy[i] == 0){
            num = num + customers[i];
        }
      }
       for(int i=0;i<customers.length;i++){
        if(grumpy[i] == 1){
            arr[i] = customers[i];
        }
      }

     int window = 0;
     int maxCus = 0;
     int left = 0;

     for(int right = 0; right<arr.length; right++){
      window = window + arr[right];
      if(right - left + 1 == minutes){
        maxCus = Math.max(maxCus, window);
        window = window - arr[left];
        left++;
      }
     } 
     return maxCus + num;
    }
}