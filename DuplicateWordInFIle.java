package myPack;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Map.Entry;

public class DuplicateWordInFIle {
	public Map<String,Integer> getCount(File file)
	{
		Map<String,Integer> wordmap=new HashMap<String,Integer>();
		FileInputStream fis=null;
		DataInputStream dis=null;
		BufferedReader bis=null;
		String line=null;
		try {
			fis=new FileInputStream(file);
			dis=new DataInputStream(fis);
			bis=new BufferedReader(new InputStreamReader(dis));
			while((line=bis.readLine())!=null)
			{
				StringTokenizer st=new StringTokenizer(line," ");
				while(st.hasMoreTokens())
				{
					String tmp=st.nextToken().toLowerCase();
					if(wordmap.containsKey(tmp))
					{
						wordmap.put(tmp, wordmap.get(tmp)+1);
					}
					else
					{
						wordmap.put(tmp, 1);
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return wordmap;
	}
	public List<Entry<String,Integer>> retrieve(Map<String,Integer> wordmap)
	{	Set<Entry<String,Integer>> set=wordmap.entrySet();
		List<Entry<String, Integer>> list=new ArrayList<Entry<String,Integer>>(set);
		Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
		        {
		            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
		            {
		                return (o2.getValue()).compareTo( o1.getValue() );
		            }
		        } );
		        return list;
		    }
	
}

