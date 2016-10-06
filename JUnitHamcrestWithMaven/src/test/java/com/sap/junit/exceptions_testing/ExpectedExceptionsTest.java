package com.sap.junit.exceptions_testing;

import java.util.ArrayList;

import org.junit.Test;

public class ExpectedExceptionsTest {
	
	@Test(expected = IndexOutOfBoundsException.class) 
	public void empty() { 
	     new ArrayList<Object>().get(0); 
	}

}
