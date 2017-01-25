
public class MaximumProduct_NOTWORKING {
	public MaximumProduct_NOTWORKING()
	{
		
	}
	
	public int[] maxProductSubArray(int[] arr)
	{
		int i=0;
		int maxSubArrayStartIndex = 0;
		int maxSubArrayEndIndex = 1;
		int maxProduct = 1;
		int product = arr[0];
		int numNegatives = 0;
		
		int prevMaxProduct = 0;
		int prevMaxStartIndex = 0;
		int prevMaxEndIndex = 0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j] < 0)
			{
				numNegatives ++;
			}
		}
		if(numNegatives%2==0)
		{
			return arr;
		}
//		[2,3,-2,4,8,9],
		while(i<arr.length && maxSubArrayEndIndex < arr.length)
		{
			
			if(arr[maxSubArrayEndIndex] * product >= maxProduct)
			{
				maxProduct = arr[maxSubArrayEndIndex] * product;
				product = arr[maxSubArrayEndIndex] * product;
				maxSubArrayEndIndex ++;
				i++;
			}
			else
			{
				prevMaxProduct = product; prevMaxStartIndex = maxSubArrayStartIndex;
				prevMaxEndIndex = maxSubArrayEndIndex;
				
				maxSubArrayStartIndex = maxSubArrayEndIndex + 1;
				maxSubArrayEndIndex = maxSubArrayStartIndex + 1;
				product = arr[maxSubArrayStartIndex];
				i = maxSubArrayStartIndex;
			}
		}
		if(product < prevMaxProduct)
		{
			maxSubArrayStartIndex = prevMaxStartIndex;
			maxSubArrayEndIndex = prevMaxEndIndex;
		}
		
		int x[] = new int[maxSubArrayEndIndex - maxSubArrayStartIndex];
		for(int j=maxSubArrayStartIndex, y =0;j<=maxSubArrayEndIndex-1; j++,y++)
		{
			x[y] = arr[j];
		}
		
		return x;
	}
	
	public static void main(String[] args)
	{
		MaximumProduct_NOTWORKING mp = new MaximumProduct_NOTWORKING();
		
		int x[] = new int[6];

		x[0] = 2;x[1] = 3;x[2] = -4;x[3] = -4;x[4] = 8;x[5] = -9;
		int[] y = mp.maxProductSubArray(x);
		System.out.println("Max product");
				
	}

}
