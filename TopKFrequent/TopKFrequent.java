import java.util.*;

public class TopKFrequent{
	public static void main(String[] args){
		int[] numbers = {1,4,2,2,4,1,4,4,5,1};
		System.out.println(Arrays.toString(topKFrequent(numbers, 3)));
	}

	public static int[] topKFrequent(int[] list, int k){
		if(list.length == k){
			return list;
		}
		HashMap<Integer, Integer> count = new HashMap<>();
		for(int number : list){
			count.put(number, count.getOrDefault(number,0)+1);
		}

		Queue<Integer> heap = new PriorityQueue<>(
		(a,b) -> count.get(a)-count.get(b)
		);
		
		for(int n:count.keySet()){
			heap.add(n);
			if(heap.size() > k){
				heap.poll();
			}
		}

		int[] answer = new int[k];
		for(int i=0; i<k; i++){
			answer[i] = heap.poll();
		}
		return answer;
		
	}
}