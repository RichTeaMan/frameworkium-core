package com.frameworkium.core.api.tests;

import com.frameworkium.core.common.listeners.*;
import com.frameworkium.core.common.reporting.allure.AllureProperties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.runners.Suite;

@Suite.SuiteClasses(value = {MethodInterceptor.class,
        TestListener.class,
        ResultLoggerListener.class})
public abstract class BaseAPITest {

    protected final Logger logger = LogManager.getLogger(this);

    /** Creates the allure properties for the report, after the test run. */
    @AfterClass
    public static void createAllureProperties() {
        AllureProperties.create();
    }

}
