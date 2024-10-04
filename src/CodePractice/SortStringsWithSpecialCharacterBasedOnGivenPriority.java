package CodePractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class SortStringsWithSpecialCharacterBasedOnGivenPriority {

	/*
	 * Algorithm;-
	 * 1.Declare a hashmap and put the buisness priority of the special character
	 * 2.use collection.sort function and use comparator to compare the strings from the array
	 * 3.Create a helper function that will return the priority of the special character from the string
	 * 4.declare two integer to grab the priority of the corrosponding strings if exist
	 * 5.check if both integer has some unequal value then return based on the priority
	 * 6.if they don't have value compare based on string compare
	 */
	public List<String> sortUsingCollections(List<String>arrList)
	{
	Map<String,Integer> map=new HashMap<String, Integer>();
	map.put("&",1);
	map.put("@",2);
	map.put("!",3);
	map.put("-",4);
	Collections.sort(arrList,(str1,str2)->
	{
		int s1=getpriority(str1, map);
		int s2=getpriority(str2, map);
		if(s1!=s2 && s1!= Integer.MAX_VALUE && s2!=Integer.MAX_VALUE)
		{
			return(Integer.compare(s1, s2));
		}
		return str1.compareTo(str2);
	}
			);
	return arrList;
	
	}
	
	public Integer getpriority(String string,Map<String,Integer>prioritymap)
	{
		for(char ch:string.toCharArray())
		{
			if(prioritymap.containsKey(ch))
			{
				return prioritymap.get(ch);
			}
		}
		return Integer.MAX_VALUE;
	}
	
	@Test
	public void testSpecialCHaracterSorting()
	{
		List<String> arrlist=new ArrayList<String>();
		arrlist.add("HW");
		arrlist.add("A&B");
		arrlist.add("A-B");
		arrlist.add("AB");
		arrlist.add("H&W");
		System.out.println(sortUsingCollections(arrlist));
	}
}
