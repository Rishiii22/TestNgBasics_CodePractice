package CodePractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.testng.annotations.Test;

public class hasmapExperiment {

HashMap<Integer,Integer> map;

@Test
public void testmaps()
{
	map=new HashMap<Integer, Integer>();
	map.put(map.getOrDefault(4,20),map.getOrDefault(3, 2));
	map.forEach((key,value)->System.out.println("Key "+key+" Value "+value));
}
}
