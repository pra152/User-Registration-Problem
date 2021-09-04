package com.blz.juintTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@SuiteClasses({ EmailTest.class, FirstNameTest.class, LastNameTest.class, MobileNumberTest.class, PasswordTest.class })
public class TestAll {

}
