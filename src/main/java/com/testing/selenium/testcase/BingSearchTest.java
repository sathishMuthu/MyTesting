package com.testing.selenium.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BingSearchTest extends BaseTest {
    @Test
    public void testSearch1() {
        driver.get(bingUrl);
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Bing"));
    }
    @Test
    public void testSearch2() {
        driver.get(bingUrl);
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Bing"));
    }
    @Test
    public void testSearch3() {
        driver.get(bingUrl);
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Bing"));
    }
    @Test
    public void testSearch4() {
        driver.get(bingUrl);
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Bing"));
    }
    @Test
    public void testSearch5() {
        driver.get(bingUrl);
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Bing"));
    }
    @Test
    public void testSearch6() {
        driver.get(bingUrl);
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Bing"));
    }

}