package CodePractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class RemoveSecondHighestElementInHashmap extends randomStringIntgenerator {
	Map<String,Integer> map;
	String key="";
public Map<String, Integer> DeclareHashmap(int mapLength)
{
	map=new HashMap<String, Integer>();
	for(int i=0;i<mapLength;i++)
	{
		map.put(randomStringGen(i+2),randomIntgenerator(i+900));
	}
	return map;
}
public Map<String, Integer> findRemoveSecondLarge(Map<String,Integer>map)
{
	List<Integer> arrayList=new ArrayList<Integer>();
	for(Map.Entry<String,Integer> valuEntry:map.entrySet())
	{
		arrayList.add(valuEntry.getValue());
	}
	Collections.sort(arrayList,Collections.reverseOrder());
	int remove=arrayList.get(1);
	for(Map.Entry<String,Integer> valuEntry:map.entrySet())
	{
		if (valuEntry.getValue()==remove) {
			key=valuEntry.getKey();
		}
		
	}
	if(key!=null)
	{
		map.remove(key);
	}
	return map;
}
public void printHashmap(Map<String,Integer> map)
{
	for(Map.Entry<String,Integer>keyval:map.entrySet())
	{
		System.out.println(keyval.getKey()+"->"+keyval.getValue());
	}
	System.out.println();
}
@Test
public void checkTheCode()
{
	map=new HashMap<String, Integer>();
	map=DeclareHashmap(5);
	printHashmap(map);
	System.out.println("After removing map looks like");
	map=findRemoveSecondLarge(map);
	printHashmap(map);
}


}
