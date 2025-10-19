import java.util.*;

public class ArrayProduct{
	public static void main(String[] args){
		int[] numbers = {1,2,3,4};
		System.out.println(Arrays.toString(arrayProduct(numbers)));
	}
	
	public static int[] arrayProduct(int[] numbers){
		int prefix = 1;
		int postfix = 1;
		
		int[] result = new int[numbers.length];
		Arrays.fill(result, 1);

		for(int i=0; i<numbers.length; i++){
			result[i] = prefix;
			prefix = prefix * numbers[i];
		}

		for(int i=numbers.length-1; i>=0; i--){
			result[i] = result[i] * postfix;
			postfix = postfix * numbers[i];
		}
		return result;
	}
}
