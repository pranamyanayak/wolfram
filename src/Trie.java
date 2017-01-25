import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;



//Implement dictionary
public class Trie {
   TrieNode root = null;
   public Trie()
   {
	   
   }
	
	/*
	 *       t
	 *     e
	 *    s  e
	 * t       t     
	 *   
	 */
   public void formTrie(String element)
   {
	   if(root == null)
	   {
		   root = new TrieNode(' ');
	   }
	   TrieNode prevNode = root;
	   for(int i=0; i< element.length(); i++)
	   {
		   if(prevNode.trieHash.get(element.charAt(i) - 65) == null)
		   {
			   prevNode.trieHash.put(element.charAt(i) - 65, new TrieNode(element.charAt(i)));
		   }
		   
		   prevNode = prevNode.trieHash.get(element.charAt(i) - 65);
	   }
	   prevNode.trieHash.put(100, new TrieNode('$'));
   }
   
   public ArrayList<String> findAllWordsWithPrefix(String prefix)
   {
	   TrieNode prevNode = root;
	   for(int i=0; i< prefix.length(); i++)
	   {
		   prevNode = prevNode.trieHash.get(prefix.charAt(i) - 65);
		   if(prevNode == null)
		   {
			   return null;
		   }
	   }
	   
	   return trieTraversal(prevNode, prefix);
   }
   
   public ArrayList<String> trieTraversal(TrieNode trienode, String prefix)
   {
	   ArrayList<String> suffixArr = new ArrayList<String>();
	   Iterator<Integer> it = trienode.trieHash.keySet().iterator();
	   while(it.hasNext())
	   {
		   int i = it.next();
		   
		   TrieNode node = trienode.trieHash.get(i);
		   if(i == 100 && node != null)
		   {
			   suffixArr.add(prefix);
		   }
		   else if(node != null)
		   {
			   suffixArr.addAll(trieTraversal(node, prefix + node.ele));
		   }
		   
	   }
	   return suffixArr;
   }
   
   
   public class TrieNode
   {
	   char ele;
	   HashMap <Integer, TrieNode> trieHash = new HashMap<Integer, TrieNode>();
	   public TrieNode(char ele)
	   {
		   this.ele = ele;
//		   Keyboard acsii values go from 65 - 122
		   for(int i=0;i<123-65; i++)
		   {
			   trieHash.put(i, null);
		   }
	   }
   }
   
   
   public static void main(String[] args)
   {
	   Trie t = new Trie();
	   t.formTrie("test");
	   t.formTrie("team");
	   t.formTrie("teammate");
	   t.formTrie("at");
	   t.formTrie("an");
	   
	   
	   ArrayList<String> allPrefix = t.findAllWordsWithPrefix("team");
	   System.out.println("Found all prefixes");
   }
}
