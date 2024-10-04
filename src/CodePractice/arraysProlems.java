package CodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class arraysProlems {
/*
 * Given an array arr of size n−1 that contains distinct integers in the range of 1 to n (inclusive),
 *  find the missing element. The array is a permutation of size n with one element missing. Return the missing element.

Examples:

Input: n = 5, arr[] = [1,2,3,5]
Output: 4
Explanation : All the numbers from 1 to 5 are present except 4.
Input: n = 2, arr[] = [1]
Output: 2
Explanation : All the numbers from 1 to 2 are present except 2.
 */
	
	
	public int MissingArray(int n, int arr[])
	{
	int sum=0;
	int sumArr=0;
	for(int i=1;i<=n;i++)
	{
		sum=sum+i;
	}
	for (int i = 1; i <=n-1; i++) {
		sumArr=sumArr+arr[i-1];
	}
	return sum-sumArr;
	}

//	@Test
	public void CheckMissingArray()
	{
		int [] arr= {1,2,3,5};
		
		System.out.println(MissingArray(5,arr));
	}
	/*
	 * You have given two sorted arrays arr1[] & arr2[] of distinct elements. The first array has one element extra added in between. Return the index of the extra element.

Note: 0-based indexing is followed.

Examples

Input: n = 7, arr1[] = {2,4,6,8,9,10,12}, arr2[] = {2,4,6,8,10,12}
Output: 4
Explanation: In the first array, 9 is extra added and it's index is 4.
Input: n = 6, arr1[] = {3,5,7,8,11,13}, arr2[] = {3,5,7,11,13}
Output: 3
Explanation: In the first array, 8 is extra and it's index is 3.
Expected Time Complexity: O(log n).
Expected Auxiliary Space: O(1).
	 */
	public int extraelement(int n, int arr1[], int arr2[])
	{
		return 0;
	}
	/*
	 * Given a sorted array containing only 0s and 1s, find the transition point, i.e., the first index where 1 was observed, and before that, only 0 was observed.

Example 1:

Input:
N = 5
arr[] = {0,0,0,1,1}
Output: 3
Explanation: index 3 is the transition 
point where 1 begins.
Example 2:

Input:
N = 4
arr[] = {0,0,0,0}
Output: -1
Explanation: Since, there is no "1",
the answer is -1.
Your Task:
You don't need to read input or print anything. The task is to complete the function transitionPoint() 
that takes array arr and N as input parameters and returns the 0-based index of the position where 0 ends
 and 1 begins. If array does not have any 1, return -1. If array does not have any 0, return 0.
	 */
	
	public int checkTransition(int n,int arr[])
	{
		 int ret=-2;
	       if(arr[0]==0)
	       {
	           for(int i=0;i<n;i++)
	           {
	               if(arr[i]==1)
	               {
	                   ret=i;
	               }
	              
	           }
	       }
	       if(arr[0]==1)
	       {
	           for(int i=0;i<n;i++)
	           {
	               if(arr[i]==0)
	               {
	                   ret=i;
	               }
	           }
	       }
	       if(ret==-2)
	       {
	           if(arr[0]==0)
	           return -1;
	           else
	           return 0;
	       }
	       return ret;
	}
	@Test
	public void testingCheckTransition()
	{
		int n=5;
		int arr[]= {0,0,0,1,1};
		System.out.println(checkTransition(n, arr));
	}
}

