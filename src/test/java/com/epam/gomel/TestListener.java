package com.epam.gomel;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    private static final Logger LOG = Logger.getLogger("Logger");

    @Override
    public void onTestStart(ITestResult result) {
        LOG.info(result.getMethod().getDescription() + " started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        LOG.info(result.getMethod().getDescription() + " passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        LOG.error(result.getMethod().getDescription() + " failed\n\t" + result.getThrowable().getMessage());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        LOG.warn(result.getMethod().getDescription() + " skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        LOG.warn(result.getMethod().getDescription() + " failed but within success percentage");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        LOG.error(result.getMethod().getDescription() + " failed with timeout");
    }

    @Override
    public void onStart(ITestContext context) {
        LOG.info(String.format("Group \"%s\" started", context.getName()));
    }

    @Override
    public void onFinish(ITestContext context) {
        LOG.info(String.format("Group \"%s\" finished", context.getName()));
    }
}
