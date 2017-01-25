
public class LongestPalindrome {
	public LongestPalindrome()
	{
		
	}
	
	public String findLongestPalindrome(String palindromicStr)
	{
		String tmp = recursePalindromme(palindromicStr,0);
		return tmp;
	}
	
	public String recursePalindromme(String palindromicStr, int level)
	{
		if (palindromicStr.length() == 1)
			return "";
		
		if(isPalindrome(palindromicStr))
		{
			return palindromicStr;
		}
		level++;
		return compare(recursePalindromme(palindromicStr.substring(0, palindromicStr.length()-1), level),
				recursePalindromme(palindromicStr.substring(1), level));
	}
	
	public String compare(String left, String right)
	{
		if(left.length() > right.length())
		{
			return left;
		}
		
		return right;
	}
	
	public boolean isPalindrome(String str)
	{
		int end = str.length() - 1;
		int start = 0;
		if(start == end)
		{
			return false;
		}
		
		while(start <= end)
		{
			if(str.charAt(start) == str.charAt(end))
			{
				start ++; end --;
			}
			else
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		LongestPalindrome lp = new LongestPalindrome();
		String pal = lp.findLongestPalindrome("testmalayalamtestabba");
		System.out.println(pal);
	}
}
