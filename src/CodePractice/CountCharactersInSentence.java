package CodePractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class CountCharactersInSentence {

	@Test
	public void sentence()
	{
		String sentenceString="where are going";
		
		Map<Character,Integer>letterMap=new HashMap<Character, Integer>();
		for(char ch:sentenceString.toCharArray())
		{
			if (Character.isLetter(ch)) {
				letterMap.put(ch,letterMap.getOrDefault(ch,1)+1);
			}
		}
		
		// printing the map
		for(Map.Entry<Character, Integer> print:letterMap.entrySet())
		{
			System.out.println(print.getKey()+"  :\t"+print.getValue());
		}
	}
}
