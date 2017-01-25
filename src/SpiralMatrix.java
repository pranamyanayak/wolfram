
public class SpiralMatrix {
	public SpiralMatrix()
	{
		
	}
	
	public void printSpiral(String[][] matrix, int current_row, int current_col, int num_row, int num_col, boolean print_row, boolean print_right, boolean print_down)
	{
		if(print_row)
		{
			int i= 0;
			if(print_right)
			{
				for(i=current_col;i<num_col;i++)
				{
					System.out.println(matrix[current_row][i]);
				}
			}
			else
			{
				for(i=current_col;i>current_col - num_col;i--)
				{
					System.out.println(matrix[current_row][i]);
				}
			}
			printSpiral(matrix, current_row, i, num_row--,num_col,false,false,true);
		}
		else
		{
			if(print_down)
			{
				for(int i=current_row+1;i<num_row;i++)
				{
					System.out.println(matrix[i][current_col]);
				}
			}
			else
			{
				for(int i=current_row-1;i>current_row-1 - num_row;i--)
				{
					System.out.println(matrix[i][current_col]);
				}
			}
		}
	}

}
