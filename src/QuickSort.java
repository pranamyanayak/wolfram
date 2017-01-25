import java.util.ArrayList;

public class QuickSort {
	public QuickSort()
	{
		
	}
	
	/*
	 * 200 3 100 4 20 5 
	 * pivot = 5
	 * 
	 */
	
	public void startSort(int[] input, int start, int end)
	{
		if (start > end)
		{
			return;
		}
		int tmp_start = start;
		int tmp_end = end;
		int pivot = input[end];
		int pivot_index = end;
		end = end - 1;
		while(start < end)
		{
			while(input[start] < pivot && start < end)
			{
				start ++;
			}
			
			while(input[end] > pivot && start < end)
			{
				end --;
			}
			int tmp = input[end];
			input[end] = input[start];
			input[start] = tmp;
			
			start ++; end --;
		}
		
		input[pivot_index] = input[end + 1];
		input[end + 1] = pivot;
		startSort(input, tmp_start, end);
		startSort(input, end + 2, tmp_end);
	}
	
	public static void main(String[] args)
	{
		QuickSort qs = new QuickSort();
		int []arr = new int[6];
		arr[0] = 210;arr[1] = 3;arr[2] = 150;arr[3] = 4;arr[4] = 20;arr[5] = 5;
		qs.startSort(arr,0, arr.length - 1);
		System.out.println("Sorted array = " + arr);
	}

}
