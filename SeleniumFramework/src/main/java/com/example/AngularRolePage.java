package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AngularRolePage extends RolePage {


    @Override
    public void goTo() {
        WebDriverWait wait = new WebDriverWait(Browser.driver, Duration.ofSeconds(120, 1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tab-roles\"]/div/a[9]/div[2]")));

        Actions actions = new Actions(Browser.driver);
        WebElement element = Browser.driver.findElement(By.xpath("//*[@id=\"tab-roles\"]/div/a[9]/div[2]"));
        actions.moveToElement(element);
        actions.perform();

        Browser.driver.findElement(By.xpath("//*[@id=\"tab-roles\"]/div/a[3]")).click();
    }

    @Override
    public String pathName() {
        WebDriverWait wait = new WebDriverWait(Browser.driver, Duration.ofSeconds(60, 1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/h1")));
//        String test = Browser.driver.getCurrentUrl();
        WebElement element = Browser.driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/h1"));
        return element.getText();
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}
