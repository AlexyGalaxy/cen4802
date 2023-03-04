package cen4802c;

import static org.junit.Assert.*;
import org.junit.Test;

public class FibSeqTest{

	@Test
	public void test() {
		FibSeq obj1=new FibSeq();
		int output_f =  obj1.rFibFun(10);
		//test the output
		assertEquals(55,output_f);
	}
}
