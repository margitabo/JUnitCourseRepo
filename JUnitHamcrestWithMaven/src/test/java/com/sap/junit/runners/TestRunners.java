package com.sap.junit.runners;

import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.sap.junit.assertions.AssertionsTest;

public class TestRunners {

	public static Result runJUnitClasses() {
		return org.junit.runner.JUnitCore.runClasses(AssertionsTest.class);
	}
	
	public static void main(String[] args) {
		Result result = runJUnitClasses();
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());
	}
}
