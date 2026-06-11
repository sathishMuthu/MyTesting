package com.testing.selenium.testcase;

import com.testing.selenium.util.SpringConfig;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterClass;

@SpringBootTest(classes = SpringConfig.class)
public class                                                                                                         BaseTest extends AbstractTestNGSpringContextTests {

    @Autowired
    protected WebDriver driver;

    @Autowired
    private Environment env;

    @Value("${app.google.url}")
    protected String googleUrl;

    @Value("${app.bing.url}")
    protected String bingUrl;

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}