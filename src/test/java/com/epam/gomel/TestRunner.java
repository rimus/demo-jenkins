package com.epam.gomel;

import org.testng.TestNG;

import java.util.Collections;
import java.util.List;

public class TestRunner {
    private static final String SUITE_XML_PATH = "./src/test/resources/test-suites.xml";

    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        List<String> files = Collections.singletonList(SUITE_XML_PATH);
        testNG.addListener(new TestListener());
        testNG.setTestSuites(files);
        testNG.run();
    }
}
