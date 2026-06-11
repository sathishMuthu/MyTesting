package com.testing.selenium.testcase;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseTest {
    @Test
    public void testSearch1() {
        driver.get(googleUrl);
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Google"));
    }
    @Test
    @Ignore
    public void testSearch2() {
        driver.get(googleUrl);
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Google"));
    }
    @Test
    public void testSearch3() {
        driver.get(googleUrl);
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Google"));
    }
    @Test
    public void testSearch4() {
        driver.get(googleUrl);
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Google"));
    }
    @Test
    public void testSearch5() {
        driver.get(googleUrl);
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Google"));
    }
    @Test
    public void testSearch6() {
        driver.get(googleUrl);
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Google"));
    }

}