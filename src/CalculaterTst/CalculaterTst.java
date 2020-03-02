package CalculaterTst;

import static org.junit.Assert.*;


import org.junit.Test;


import Calculater.Calculater;

public class CalculaterTst {

	@Test
	public void testMult_TwoPosInt_PosInt() {
		
		Calculater o=new Calculater();
		int res=o.mult(5,2);
		assertTrue(res==10);
	}
	@Test
	public void testMult_TwoNegInt_PostInt() {
		
		Calculater o=new Calculater();
		int res=o.mult(-5,-2);
		assertTrue(res==10);
	}
	
	@Test
	public void testMult_OnePosIntWith0_ZeroInt() {
		
		Calculater o=new Calculater();
		int res=o.mult(5,0);
		assertTrue(res==0);
	}
	@Test
	public void testMult_OneNegIntWith0_ZeroInt() {
		
		Calculater o=new Calculater();
		int res=o.mult(-5,0);
		assertTrue(res==0);
	}
	@Test 
	public void testMult_FirstPosIntSecondNeg_NegInt() {
		
		Calculater o=new Calculater();
		int res=o.mult(5,-2);
		
		assertTrue(res==-10);
	}
	@Test
	public void testMult_FirstNegIntSecondNeg_NegInt() {
		
		Calculater o=new Calculater();
		int res=o.mult(-5,2);
		assertTrue(res==-10);
	}
	
	
	
}
