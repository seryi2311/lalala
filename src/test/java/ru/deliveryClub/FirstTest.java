package ru.deliveryClub;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FirstTest extends WebDriverSettings {

    @Test

            public void firstTest(){
        driver.get("https://mail.ru/");
            WebElement signIn = driver.findElement(By.name("login"));
            signIn.sendKeys("siil1312");
            driver.findElement(By.className("icon-next")).click();

            WebDriverWait wait = new WebDriverWait(driver,15);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
            driver.findElement(By.name("password")).sendKeys("1312hsva");
            driver.findElement(By.className("second-button")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("button2__txt")));
            driver.findElement(By.className("button2__txt"));
    }

    @Test

    public void test() throws InterruptedException {
        driver.get("https://spb.hh.ru/account/login");
        WebElement vk = driver.findElement(By.cssSelector("a[data-qa=\"account-login-social-vk\"]"));
        vk.click();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("pass")));
        WebElement login = driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("pass"));
        login.sendKeys("seryi2311@gmail.com");
        password.sendKeys("1312hSva");
        WebElement button = driver.findElement(By.id("install_allow"));
        button.click();
        WebElement myResume = driver.findElement(By.cssSelector("a[data-qa=\"mainmenu_myResumes\"]"));
        myResume.click();
        Thread.sleep(1000);
        WebElement vacancies = driver.findElement(By.cssSelector("a[href=\"/search/vacancy?resume=7d444026ff089253b10039ed1f6467466b6953&from=resumelist\"]"));
        vacancies.click();
        Thread.sleep(2000);
        while (true){
            List<WebElement> next = driver.findElements(By.className("HH-Pager-Controls-Next"));
            if(next.size()!=0) {
                List<WebElement> allVacancies = driver.findElements(By.className("HH-VacancyResponsePopup-Link"));
                for (WebElement elem : allVacancies) {
                    elem.click();
                    driver.getPageSource();
                    Thread.sleep(1000);
                    WebElement otkl = driver.findElement(By.cssSelector("button[data-qa=\"vacancy-response-submit-popup\"]"));
                    otkl.click();
                    Thread.sleep(2000);
                    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("HH-VacancyResponsePopup-Link")));
                }
                WebElement next1 = driver.findElement(By.className("HH-Pager-Controls-Next"));
                next1.click();
            }else {
                break;
            }
        }
    }

    @Test

    public void englishAdd() throws IOException, InterruptedException {
        Map<String, String> arr = Data.addCard();
        driver.manage().window().maximize();
        driver.get("https://ankiuser.net/");
        WebElement button = driver.findElement(By.cssSelector("a[href=\"https://ankiweb.net/account/login\"]"));
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href=\"https://ankiweb.net/account/login\"]")));
        button.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        WebElement login = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        login.sendKeys("seryi2311@gmail.com");
        password.sendKeys("1312hsv");
        WebElement buttonLogin = driver.findElement(By.cssSelector("input[value=\"Log in\"]"));
        buttonLogin.click();
        WebElement addCard = driver.findElement(By.cssSelector("a[href=\"https://ankiuser.net/edit/\"]"));
        addCard.click();
        WebElement face = driver.findElement(By.id("f0"));
        WebElement back = driver.findElement(By.id("f1"));
        WebElement control = driver.findElement(By.id("deck"));
        Thread.sleep(1000);
        control.clear();
        control.sendKeys("test");
        WebElement tag = driver.findElement(By.id("f-1"));
        tag.sendKeys("aaaa");
        tag.clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn-primary")));
        WebElement buttonSave = driver.findElement(By.className("btn-primary"));
        for (Map.Entry<String, String> pair : arr.entrySet())
        {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            face.sendKeys(key);
            Thread.sleep(1000);
            back.sendKeys(value);
            Thread.sleep(1000);
            buttonSave.click();
            Thread.sleep(2000);
        }


    }

}
