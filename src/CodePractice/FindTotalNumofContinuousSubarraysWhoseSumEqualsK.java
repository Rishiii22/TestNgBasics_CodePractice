package CodePractice;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class FindTotalNumofContinuousSubarraysWhoseSumEqualsK {

	/*
	 * Algo:-
	 * 1.Create a variable cursum =0 for storing real sum arr sum value and count=0 for counting the k occurance
2. Create a hasmap map  and enter value(0,1)  which represents <Sum,Count>
 
3. iterate through the arr and grab each element sum them then store the value in currsum
 
4.At each iteration first check if map contains a key having currsum-k .If yes increase the count

4. At each iteration store currsum value in the map with count as 1 but if the currsum exist already increase the map counter
	 */
	
	 public int KSumCount(int[] arr, int k) {
        // code here
		 int currsum=0,count=0;
		 Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		 map.put(0,1);
		 for(int num:arr)
		 {
			 currsum+=num;
			 if (map.containsKey(currsum-k)) {
				count+=map.get(currsum-k);
			}
			 map.put(currsum,map.getOrDefault(currsum,0)+1);
			 
		 }
		 return count;
    }
	 
	 @Test
	 public void checkKSumCode()
	 {
		 int [] arr= {2,3,7,4,1,5};
		System.out.println( KSumCount(arr, 5));
	 }
}

