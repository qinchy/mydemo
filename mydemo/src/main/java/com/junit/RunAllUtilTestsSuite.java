package com.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 批量测试 工具包 中测试类
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({WordDealUtilTest.class})
public class RunAllUtilTestsSuite {
}