package com.epam.gomel.model;

import org.testng.Assert;
import org.testng.annotations.*;

public class CalcTest {
    private Calc calc;

    @BeforeClass
    public void setUp() {
        calc = new Calc();
    }

    @DataProvider(name = "Data for testSum")
    public Object[][] dataProviderForTestSum() {
        return new Object[][]{
                {1, 1, 2},
                {14, -4, 10},
                {100, 1, 101}
        };
    }

    @Test(dataProvider = "Data for testSum", description = "Test for sum")
    public void testSum(int a, int b, int expectedSum) {
        int actualSum = calc.sum(a, b);
        Assert.assertEquals(actualSum, expectedSum, "Method sum doesn't work or your test data is invalid.");
    }

    @DataProvider(name = "Data for testSub")
    public Object[][] dataProviderForTestSub() {
        return new Object[][]{
                {1, 1, 0},
                {14, -4, 18},
                {100, 1, 99}
        };
    }

    @Test(dataProvider = "Data for testSub", description = "Test for sub")
    public void testSub(int a, int b, int expectedSub) {
        int actualSub = calc.sub(a, b);
        Assert.assertEquals(actualSub, expectedSub, "Method sub doesn't work or your test data is invalid.");
    }

    @DataProvider(name = "Data for testMul")
    public Object[][] dataProviderForTestMul() {
        return new Object[][]{
                {10, 10, 10, 1000},
                {100, 2, 2, 400},
                {3, 4, 5, 60}
        };
    }

    @Test(dataProvider = "Data for testMul", description = "Test for mul")
    public void testMul(int a, int b, int c, int expectedMul) {
        int actualMul = calc.mul(a, b, c);
        Assert.assertEquals(actualMul, expectedMul, "Method mul doesn't work or your test data is invalid.");
    }

    @Test(description = "Red test")
    public void testThatAlwaysFails() {
        int actualSum = calc.sum(10, 10, 10);
        Assert.assertEquals(actualSum, 40, "Method sum doesn't work or your test data is invalid.");
    }

    @AfterClass
    public void tearDown() {
        calc = null;
    }
}
