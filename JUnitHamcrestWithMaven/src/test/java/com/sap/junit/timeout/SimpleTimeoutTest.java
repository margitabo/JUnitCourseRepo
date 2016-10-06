package com.sap.junit.timeout;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class SimpleTimeoutTest {
	
	@Test(timeout = 5000)
	public void testWithTimeout() {
		while (true) {
			assertTrue(true);
		}
	}

}
