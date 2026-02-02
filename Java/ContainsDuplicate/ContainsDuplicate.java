import java.util.HashSet;

public static void main (String[] args) {
    int numbers[] = {1,2,3,2,1,4};
    System.out.println(solution(numbers));

}

public static Boolean solution(int[] nums){
    HashSet<Integer> seenNumbers = new HashSet<>();
    for(int num : nums){
        if(seenNumbers.contains(num)){
            return true;
        }
        seenNumbers.add(num);
    }
    return false;
}