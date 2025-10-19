import java.util.*;

public class StringEncoderDecoder{
	public static void main(String[] args){
		List<String> originalList = Arrays.asList("ab","abc","ca","d");
		String encodedString = encode(originalList);
		System.out.println(encodedString);
		List<String> decoded = decode(encodedString);
		System.out.println(decoded);
	}

	public static String encode(List<String> strs){
		if(strs.size() == 0){
			return Character.toString((char) 258);
		}

		String separator = Character.toString((char) 257);
		StringBuilder sb = new StringBuilder();

		for(String word : strs){
			sb.append(word);
			sb.append(separator);
		}
		sb.deleteCharAt(sb.length() -1 );
		return sb.toString();
	}	

	public static List<String> decode(String s){
		if(s.equals(Character.toString((char) 258))){
			return new ArrayList();
		}

		String separator = Character.toString((char) 257);
		return Arrays.asList(s.split(separator, -1));
	}
}