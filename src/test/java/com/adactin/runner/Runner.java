package com.adactin.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.adactin.execution.Exe;
import com.adactin.execution.Execution;

@RunWith(Suite.class)
@SuiteClasses({Execution.class, Exe.class})
public class Runner {

}
