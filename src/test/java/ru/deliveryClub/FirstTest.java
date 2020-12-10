package ru.deliveryClub;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest extends WebDriverSettings {

    @Test

            public void firstTest(){
        driver.get("https://mail.ru/");
            WebElement signIn = driver.findElement(By.name("login"));
            signIn.sendKeys("siil1312");
            driver.findElement(By.cssSelector("[value=\"Ввести пароль\"]")).click();

            WebDriverWait wait = new WebDriverWait(driver,15);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
            driver.findElement(By.name("password")).sendKeys("1312hsva");
            driver.findElement(By.cssSelector("[value=\"Ввести пароль\"]")).click();
            driver.findElement(By.cssSelector("[value=\"Ввести пароль\"]")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("button2__txt")));
            driver.findElement(By.className("button2__txt"));
    }

}
