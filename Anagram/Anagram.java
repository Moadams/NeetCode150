public class Anagram{
	public static void main(String[] args){
		System.out.println(isAnagram("kofi","fiko"));
	}

	public static boolean isAnagram(String s, String t){
		if(s.length() != t.length()){
			return false;
		}
		
		int[] checkList = new int[26];
		for(int i = 0; i<s.length(); i++){
			checkList[s.charAt(i) - 'a']++;
			checkList[t.charAt(i) - 'a']--;
		}
		for (int num : checkList){
			if(num != 0){
				return false;
			}
		}
		return true;
	}
}