//For a boolean, the default value is: false

class Solution {
    public boolean checkIfPangram(String sentence) {
      boolean[] seen = new boolean[26];
      for(int i = 0;i< sentence.length(); i++){
        char ch = sentence.charAt(i);
        seen[ch - 'a'] = true;
      }
      for(boolean value : seen){
        if(!value){
            return false;
        }
      }
      return true;
    }
}