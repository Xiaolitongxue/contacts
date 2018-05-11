package com.yiibai.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
//@Suite.SuiteClasses({ PrepareMyBagTest.class, AddPencilsTest.class })
//Another seq
@Suite.SuiteClasses({ AddPencilsTest.class, PrepareMyBagTest.class })
public class SuiteTest {

}