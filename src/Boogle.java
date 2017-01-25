
public class Boogle {
	
	
	public void findWords(String[][] input)
	{
		int m = input.length;
		int n = input[0].length;
		int col = 0;
		int row = 0;
		for(int i=0; i< m * n ; i++)
		{
			row = i / m;
			findAllWords(row, col, input, input[row][col]);
			col ++;
			if(col >= n)
			{
				col = 0;
			}
		}
	}
	
	
	public void findAllWords(int row, int col, String[][] input, String word)
	{
		if(word.equals("BEVID"))
		  System.out.println(word);
		int m = input.length;
		int n = input[0].length;
		
		if (word.length() > 5)
		{
			return;
		}
		
		if(row - 1 > -1)
		{
			findAllWords(row-1, col, input, word + input[row - 1][col]);
		}
		
		if(row + 1 < m)
		{
			findAllWords(row+1, col, input, word + input[row + 1][col]);
		}
		
		if(row - 1 > -1 && col - 1 > -1)
		{
			findAllWords(row-1, col-1, input, word + input[row - 1][col-1]);
		}
		
		if(col - 1 > -1 && row + 1 < m)
		{
			findAllWords(row+1, col-1, input, word + input[row + 1][col-1]);
		}
		
		if(row - 1 > -1 && col + 1 < n)
		{
			findAllWords(row-1, col+1, input, word + input[row - 1][col+1]);
		}
		
		if(row + 1 < m && col + 1 < n)
		{
			findAllWords(row+1, col+1, input, word + input[row + 1][col+1]);
		}
		
		if(col -1 > -1)
		{
			findAllWords(row, col-1, input, word + input[row][col-1]);
		}
		
		if(col + 1 < n)
		{
			findAllWords(row, col+1, input, word + input[row][col+1]);
		}
	}
	
	public static void main(String[] args)
	{
		String [][] input = new String[4][4];
//		input[0][0] = "Y";input[0][1] = "N";input[0][2] = "A";input[0][3] = "I";
//		input[1][0] = "L";input[1][1] = "G";input[1][2] = "A";input[1][3] = "H";
//		input[2][0] = "T";input[2][1] = "L";input[2][2] = "C";input[2][3] = "N";
//		input[3][0] = "N";input[3][1] = "A";input[3][2] = "O";input[3][3] = "N";
		
		input[0][0] = "A";
		input[0][1] = "B";
		input[0][2] = "E";
		input[0][3] = "T";
        
		input[1][0] = "C";
		input[1][1] = "G";
		input[1][2] = "O";
		input[1][3] = "V";
        
		input[2][0] = "R";
		input[2][1] = "E";
		input[2][2] = "Q";
		input[2][3] = "I";
        
		input[3][0] = "P";
		input[3][1] = "O";
		input[3][2] = "A";
		input[3][3] = "D";
        
		Boogle b = new Boogle();
		
		b.findWords(input);
	}
}
