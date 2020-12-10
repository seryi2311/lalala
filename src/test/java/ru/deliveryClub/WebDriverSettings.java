package ru.deliveryClub;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/home/siil/Downloads/chromedriver");
        driver = new ChromeDriver();
    }

   /* @After
    public void closed() {
        driver.quit();
    }*/


}
