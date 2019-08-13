package com.nepxion.discovery.gray.test.base;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

public interface TestCase {
    void run();

    void beforeTest();

    void runTest();

    void afterTest();

    String getTestMethod();
}
