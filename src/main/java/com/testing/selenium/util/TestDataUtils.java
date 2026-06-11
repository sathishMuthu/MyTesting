package com.testing.selenium.util;

import org.springframework.stereotype.Component;
import org.testng.annotations.DataProvider;

@Component
public class TestDataUtils {
    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        // Logic to read Excel file using Apache POI
        // Return data as new Object[][] { {"user1", "pass1"}, {"user2", "pass2"} };
        Object[][] testData = {
                {"admin_user", "admin_user@gmil.com"},
                {"john_doe", "john_doe@gmail.com"},
                {"locked_customer", "locked_customer@gmail.com"},
                {"invalid_status", "invalid_status@gmail.com"}
        };
        return testData;
    }
}