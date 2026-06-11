package com.testing.selenium.testcase;

import com.testing.selenium.util.TestDataUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DataDrivenTest extends BaseTest{

    @Test(dataProvider = "loginData", dataProviderClass = TestDataUtils.class)
    public void test1(String name, String email){
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.findElement(By.id("name")).sendKeys(name.toString());
        driver.findElement(By.id("email")).sendKeys(email.toString());
    }
}
