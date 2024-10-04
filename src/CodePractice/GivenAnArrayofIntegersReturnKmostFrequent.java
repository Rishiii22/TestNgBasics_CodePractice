package CodePractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class GivenAnArrayofIntegersReturnKmostFrequent {

	/*
	 * Algorithm-
	 * 
	 * 1.Declare a hashmap
	 * 2.Create a loop and iterate through each array element
	 * 3.put the element in the hashmap if the element already exist in the hashmap then increase the counter
	 * 4.once iteration through array is done grab all the value from hashmap store it in array list and
	 * return the the highest value from it
	 */
	
	public Integer findHighestElement(int arr[])
	{
		Map<Integer,Integer>map=new HashMap<Integer, Integer>();
		for(int num:arr)
		{
			map.put(num,map.getOrDefault(num,0)+1);
		}
		List<Integer> list=new ArrayList<Integer>();
		for(int val:map.values())
		{
			list.add(val);
		}
		Collections.sort(list);
		return list.get(list.size()-1);
	}
	
	@Test
	public void runhighestElement()
	{
		int[] arr= {2,5,1,5,2,1,2,3,3,1,5,2,3};
		System.out.println(findHighestElement(arr));
	}
}
