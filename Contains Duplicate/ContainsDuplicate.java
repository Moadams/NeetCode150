import java.util.HashSet;

public class ContainsDuplicate{
	public static void main (String[] args){
		int[] numbers = {1,2,4,2,1};
		System.out.println(checkDuplicate(numbers));	
	}
	public static boolean checkDuplicate(int[] numbers){
		HashSet<Integer> seenNumbers = new HashSet<>();
		for (int num : numbers){
			if(seenNumbers.contains(num)){
				return true;
			}
			seenNumbers.add(num);
		}		
		return false;
	}
}