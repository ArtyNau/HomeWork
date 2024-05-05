package com.poahome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartEmptyPage extends TopPart {

    static WebElement lable;
    static WebElement button;

    public ShoppingCartEmptyPage(WebDriver driver) {
        super(driver);
        initElements();
    }


    public void initElements() {
       lable = driver.findElement(By.cssSelector("#content > p"));
       button = driver.findElement(By.cssSelector("#content > div > div > a"));
    }

    public static String getLable() {
        return lable.getText();
    }
    public static void clickButton() {
        button.click();

}
}