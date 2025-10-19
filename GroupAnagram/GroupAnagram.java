import java.util.*;


public class GroupAnagram{
	public static void main (String[] args){
		String[] list = {"kofi", "ama", "fiko", "maa"};
		System.out.println(groupAnagrams(list));
	}

	public static List<List<String>> groupAnagrams(String[] strgs){
		if(strgs.length == 0){
			return new ArrayList();
		}
		
		HashMap<String, List<String>> ansMap = new HashMap<>();

		for(String word : strgs){
			char[] wordArray = word.toCharArray();
			Arrays.sort(wordArray);
			String sortedWord = new String(wordArray);
			
			ansMap.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
			
		}
		return new ArrayList<>(ansMap.values());
		
	}
}