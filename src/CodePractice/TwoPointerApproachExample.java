package CodePractice;

import javax.sql.rowset.JoinRowSet;

import org.testng.annotations.Test;

public class TwoPointerApproachExample {

	//Find if an Array has Two Numbers that Sum Up to a Target
	@Test
	public void hasTwoSum()
	{
		int[] arr= {1,2,3,4,5,6,7,8,9,45,67,89,102,104,107};
		System.out.println(hasTwoSum(arr,74));
	}

	private String hasTwoSum(int[] arr, int target) {
		int left=0;
		int right=arr.length-1;
		int sum;
		while(left<right)
		{
			sum=arr[left]+arr[right];
			if(sum==target)
			{
				return "the values are "+arr[left]+",\t"+arr[right];
			}
			else if(sum>target) {
				right--;
			}
			else {
				left++;
			}
		}
		return "No such element found";
	}

	
}
