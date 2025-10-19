import java.util.HashMap;

public class SumTarget{
	public static void main(String[] args){
		int[] numbers = {1,2,3,4};
		System.out.println(Arrays.toString(twoSum(numbers, 6)));
	}

	public static int[] twoSum(int[] numbers, int target){
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i=0; i < numbers.length; i++){
			int complement = target - numbers[i];
			if(map.containsKey(numbers[i])){
				System.out.println(map.get(complement));
				return new int[] {map.get(complement), i};
			}
			map.put(numbers[i], i);
		}
		return new int[] {};
	}
}