// Given an array
// Form bin search tree
public class FormBinarySearchTree {
	
	public class Node
	{
		int ele;
		Node left;
		Node right;
		
		public Node(int ele)
		{
			this.ele = ele;
		}
	}
	
	public FormBinarySearchTree()
	{
		
	}
	
	public Node formTree(int[] arr)
	{
		if(arr.length == 0)
		{
			return null;
		}
		
		int ele = arr[arr.length / 2];
		Node tmp = new Node(ele);
		if(arr.length == 1)
		{
			return tmp;
		}
		
		int tmpArrLeft[] = new int[arr.length/2];
		int tmpArrRight[] = new int[arr.length/2-1];
		

		
		for(int i=0, count=0;i<arr.length/2;i++)
		{
			tmpArrLeft[count] = arr[i];
			count ++;
		}
		
		for(int i=arr.length/2+1, count=0;i<arr.length;i++)
		{
			tmpArrRight[count] = arr[i];
			count ++;
		}
		tmp.left = formTree(tmpArrLeft);
		tmp.right = formTree(tmpArrRight);
		return tmp;
	}
	
	public static void main(String[] args)
	{
		FormBinarySearchTree bin = new FormBinarySearchTree();
		int[] arr = new int[5];
		arr[0] = 2; arr[1] = 5;arr[2] = 6; arr[3] = 10;arr[4] = 12;
		Node root = bin.formTree(arr);
		System.out.println("Tree formed");
	}

}
