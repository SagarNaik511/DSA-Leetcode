class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> arr = new ArrayList<>();
    for(int i = 0;i<operations.length;i++){
        switch(operations[i]){
            case "+":
              int total = arr.get(arr.size() - 1) + arr.get(arr.size() - 2);
              arr.add(total);
              break;

            case "D":
              int mul = arr.get(arr.size() - 1) * 2;
              arr.add(mul);
              break;

            case "C":
              int last = arr.size() - 1;
              arr.remove(last);
              break;

            default:
              int num = Integer.parseInt(operations[i]);
              arr.add(num);
              break;
        }
      }
      int sum = 0;
      for(int value : arr){
        sum = sum + value;
      }
      return sum;
    }
}