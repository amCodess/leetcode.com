class Solution {
    public boolean isAnagram(String s, String t) {
        boolean anagram = true;

        String[] sCharacters = s.split("");
        String[] tCharacters = t.split("");
        Arrays.sort(sCharacters);
        Arrays.sort(tCharacters);

        if(sCharacters.length!=tCharacters.length){
            anagram = false;
        }else{
            for(int i= 0; i<sCharacters.length;i++){
                if(!sCharacters[i].equals(tCharacters[i])){
                    anagram = false;
                    break;
                }
            }
        }
    
        return anagram;
    }
}