package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hclCodes.AreaOfTriangle;

public class AreaOfTriangleTest {
	AreaOfTriangle t=new AreaOfTriangle();
	@Test
	public void testAreaWithPositiveValue() {
	double actualArea= t.getArea(3, 4);
	double ExpectedArea= (double)6;
	Assert.assertEquals(actualArea, ExpectedArea);
}
	@Test
	public void testAreaWithNegativeValue() {
	double actualArea= t.getArea(-3, 4);
	double ExpectedArea= (double)-6;
	Assert.assertEquals(actualArea, ExpectedArea);
	
	}
	
}