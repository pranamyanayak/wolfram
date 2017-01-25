import java.util.ArrayList;

//https://leetcode.com/problems/restore-ip-addresses/
//Needs to be solved
public class RestoreIpAddress {
	public RestoreIpAddress()
	{
		
	}
	
    //	25525511135
	public ArrayList<String> returnAllValidIp(String ip)
	{
		ArrayList<Node> tail = new ArrayList<Node>();
		ArrayList<Node> newTail = new ArrayList<Node>();
		ArrayList<Node> leafNodes = new ArrayList<Node>();

		Node root = new Node("",0);
		tail.add(root);

		for(int i = 0; i< ip.length(); i++)
		{
			String ele = ip.substring(i, i+1);
			Node tmp = null;				
			for(int j=0;j<tail.size();j++)
			{
				Node currTail = tail.get(j);
				
				if(currTail.level + 1 > 3)
				{
					if(i >= ip.length() - 2)
					{
						tmp = new Node("leaf",currTail.level + 1);
						currTail.children.add(tmp);
						tmp.parent = currTail;
						leafNodes.add(tmp);
					}

				}
				else
				{
					tmp = new Node(ele,currTail.level + 1);
					currTail.children.add(tmp);
					tmp.parent = currTail;
					newTail.add(tmp);
					
					if(currTail.parent != null)
					{
						String currTailEle = currTail.ele;
						String newEle = currTailEle + ele;
						if(Integer.parseInt(newEle) <= 255)
						{
							Node newTmpNode = new Node(newEle,currTail.parent.level + 1);
							currTail.parent.children.add(newTmpNode);
							newTmpNode.parent = currTail.parent;
							newTail.add(newTmpNode);
						}

					}
				}
			}
			tail.clear();
			
			tail.addAll(newTail);
			newTail.clear();
		}
		return null;
	}
	
	public class Node
	{
		int level = 0;
		Node parent;
		ArrayList<Node> children = new ArrayList<>();
		String ele;
		public Node(String ele, int level)
		{
			this.ele = ele;
			this.level = level;
		}
	}
	
	public static void main(String []args)
	{
		String str = "25525511135";
		RestoreIpAddress rip = new RestoreIpAddress();
		rip.returnAllValidIp(str);
	}
	
	

}
