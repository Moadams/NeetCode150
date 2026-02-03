package Anagram;

public class Anagram{
    public static void main (String[] args){
        String s = "cat";
        String t = "taca";
        System.out.println(checkAnagram(s, t));
    }
    
    public static boolean checkAnagram(String s, String t){
        int[] charCount = new int[26];
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0; i< s.length(); i++){
            charCount[s.charAt(i) - 'a'] ++;
            charCount[t.charAt(i) - 'a'] --;
        }
        for(int num : charCount){
            if(num != 0){
                return false;
            }
        }
        return true;
    }
}