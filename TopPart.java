package com.poahome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopPart {

    protected WebDriver driver;

    private static WebElement shoppingCart;


    public TopPart(WebDriver driver) {
        this.driver = driver;
        initElements();
    }

    public void initElements() {
        shoppingCart = driver.findElement(By.cssSelector("#top > div.container > div.nav.float-end > ul > li:nth-child(4) > a > span"));

    }

    public String getshoppingCart() {
        return shoppingCart.getText();
    }

    public static void clickshoppingCart() {
        shoppingCart.click();
    }

}