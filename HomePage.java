package com.poahome;

import org.openqa.selenium.WebDriver;

public class HomePage extends TopPart {

    public static String homePage = "https://demo.opencart.com/index.php?route=common/home&language=en-gb";

    public HomePage(WebDriver driver) {
        super(driver);
    }
    
}
