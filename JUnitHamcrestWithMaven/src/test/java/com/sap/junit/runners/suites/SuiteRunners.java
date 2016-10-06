package com.sap.junit.runners.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.sap.junit.assertions.AssertionsTest;

@RunWith(Suite.class)
@SuiteClasses({ AssertionsTest.class})
public class SuiteRunners{

}