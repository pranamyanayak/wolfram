import java.util.ArrayList;

//Permutation problem
/*
 *                            123
 *                123         213            321
 *           123      132 213      231    321    312
 */

public class Permutation {
	
	public ArrayList<char[]> allPossiblePermutation(char[] str, int charIndex)
	{
		ArrayList<char[]> list = new ArrayList<char[]>();
		if(charIndex >= str.length - 1)
		{
			list.add(str);
			return list;
		}
		char []tmpStr = new char[str.length];
		tmpStr = str.clone();
		for(int i=charIndex; i<str.length;i++)
		{
		    char tmp = tmpStr[charIndex];
		    tmpStr[charIndex] = tmpStr[i];
		    tmpStr[i] = tmp;
		    
		    list.addAll(allPossiblePermutation(tmpStr, charIndex + 1));
		    tmpStr = str.clone();
		}
		return list;
	}
	
	public static void main(String []args)
	{
		char[] str = new char[4];
		str[0] = '1'; str[1] = '2';str[2] = '3';str[3] = '4';
		Permutation p = new Permutation();
		ArrayList<char[]> list = p.allPossiblePermutation(str, 0);
		System.out.println("List received");
	}

	
}
