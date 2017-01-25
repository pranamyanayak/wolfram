import java.util.ArrayList;

// Get square root of a number.
/*
 * Get 2 factors for the number by dividing by prime numbers.
 * Once you have 2 factors.
 */
public class SqrtX {
	public SqrtX()
	{
		
	}
	
	public ArrayList<Integer> getAllFactors(int num)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);primes.add(3);primes.add(5);primes.add(7);
		for(int i=0;i<primes.size();i++)
		{
			int prime= primes.get(i);
			while(num%prime == 0)
			{
				arr.add(prime);
				num = num / prime;
			}
		}
		arr.add(1);
		return arr;
	}

	public float findSqrtX(int num)
	{
		int origNum = num;

		ArrayList<Integer> arr = getAllFactors(num);
		int num1 = 1;
		int num2 = 1;
		for(int i=0;i<arr.size()/2;i++)
		{
			num1 *= arr.get(i);
		}
		
		for(int i=arr.size()/2;i<arr.size();i++)
		{
			num2 *= arr.get(i);
		}
		
		System.out.println("Array");
		while(num1 != num2)
		{
			if (num2 != num1 )
			{
				int num3 = ( num2 + num1 )/2;
				num1 = num3;
				num2 = origNum/num1;
			}
		}
		return num1;
	}
	
	public static void main(String[] args)
	{
		SqrtX sx = new SqrtX();
		sx.findSqrtX(7);
	}
	
}
