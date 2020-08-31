package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrintsTheNumbers {
	@Test
	public void ValidatePrintedNo() {
		

		
		int[] actual= {1,2,3,4,5,6,7,8,9,10};
		int[] expected= new int[10];
		for(int j=1; j<10; j++) {
			
			expected[j]=j+1;
			//System.out.print(j);			
		}
		Assert.assertEquals(actual[1], expected[1]);
		
		
		try {
			Assert.assertEquals(actual[0], expected[1]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	}

