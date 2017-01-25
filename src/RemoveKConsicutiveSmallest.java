//Remove K consecutive digits such that number is smallest
/*
 * for(int i=0;i<str.length)
 */
public class RemoveKConsicutiveSmallest {
	
	public String returnSmallest(String num, int k)
	{
		int smallest = 999999999;
		for(int i=0;i<num.length();i++)
		{
			if(i+k < num.length())
			{
				String beginStr = num.substring(0, i);
				String endStr = num.substring(i+k);
				String tmpStr = beginStr + endStr;
				int tmpNum = Integer.parseInt(tmpStr);
				if(tmpNum < smallest)
				{
					smallest = tmpNum;
				}
			}
		}
		return Integer.toString(smallest);
	}
	
	public static void main(String[] args)
	{
		RemoveKConsicutiveSmallest rk = new RemoveKConsicutiveSmallest();
		String smallest = rk.returnSmallest("11322193", 3);
		System.out.print(smallest);
	}

}
