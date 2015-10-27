package myPack;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DupliCharsInString {
	public void findduplicate(String a)
	{
		char[] ch=a.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(Character chr:ch)
		{
			if(map.containsKey(chr))
			{
				map.put(chr, map.get(chr)+1);
			}
			else
			{
				map.put(chr, 1);
			}
		}
		Set<Character> s=map.keySet();
		for(Character bn:s)
		{
			if(map.get(bn)>1)
			{
				System.out.println("key:"+bn);
			}
		}
	}
	public static void main(String args[])
	{
		DupliCharsInString dupliCharsInString=new DupliCharsInString();
		dupliCharsInString.findduplicate("Asheesh");
	}
}
