import java.util.*;

public class LongestSubsequence{
	public static void main(String[] args){
		int[] numbers = {100,4,200,1,3,2};
		System.out.println(longestSubsequence(numbers));
	}

	public static int longestSubsequence(int[] numbers){
		HashSet<Integer> tableSet = new HashSet<>();
		for(int i=0; i<numbers.length; i++){
			tableSet.add(numbers[i]);
		}


		int longestSub = 1;

		for(int num : tableSet){
			if(tableSet.contains(num-1)){
				continue;
			}else{
				int currentSub = 1;
				int currentNum = num;
				while(tableSet.contains(currentNum + 1)){
					currentNum++;
					currentSub++;
				}
				longestSub = Math.max(longestSub, currentSub);
			}
		}
		return longestSub;
	}
}