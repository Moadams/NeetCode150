public class ValidSudoku{
	public Boolean validSudoku(char[][] board){
		int n = 9;
		
		HashSet<Character>[] rows = new HashSet<Character>[n];
		HashSet<Character>[] columns = new HashSet<Character>[n];
		HashSet<Character>[] boxes = new HashSet<Character>[n];
	
		for(int i=0; i<n; i++){
			rows[i] = new HashSet<Character>();
			columns[i] = new HashSet<Character>();
			boxes[i] = new HashSet<Character>();
		}

		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				char val = board[i][j];
				if(val == "."){
					continue;
				}
				
				if(row[i].contains(val)){
					return false;
				}
				row[i].add(val);

				if(columns[j].contains(val)){
					return false;
				}
				columns[j].add(val);

				int index = (i/3) + 3 + (j/3);
				if(boxes[index].contains(val)){
					return false;
				}
				boxes[index].add(val);
			}
		}
		return true;
	}
}