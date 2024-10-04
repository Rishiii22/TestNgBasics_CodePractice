package CodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class MisllneaousSmallConceptsPractie {
Integer n;
//	@Test
	public void IntegerCompare()
	{
		System.out.println(Integer.compare(50, 10));
	}
		public List<Integer> SortUsingCustomComparator(List<Integer> arrlist)
		{
			Collections.sort(arrlist,(n1,n2)->{
			
				return Integer.compare(n2,n1);
			}
			
			);
			return arrlist;
		}
//		@Test
		public void checkSortUsingCustomComparator()
		{
			System.out.println("**********"+this.getClass().getSimpleName()+"*****************");
			List<Integer>arrlist=Arrays.asList(10,3,4,2,17);
			System.out.println(SortUsingCustomComparator(arrlist));
		}
		@Test
		public void strCompare()
		{
			System.out.println("AB".compareTo("HB"));
		}
		
}
