package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_SELECT = "//div[contains(@class, \"_4-i2\")]//div[3]/button[2] ";
    public static final String XPATH_SELECT1 = "//div[contains(@class, \"52jv\")]/form/div[5]/a";
    public static final String XPATH_SPAN = "//div[contains(@class, \"_5k_5\")]/span[contains(@class, \"_5k_4\")]/span";
    public static final String XPATH_DAY = XPATH_SPAN + "/select[contains(@name, \"birthday_day\")]";
    public static final String XPATH_MONTH = XPATH_SPAN + "/select[contains(@name, \"birthday_month\")]";
    public static final String XPATH_YEAR = XPATH_SPAN + "/select[contains(@name, \"birthday_year\")]";



    public static void main(String args[]) throws InterruptedException {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        while (!driver.findElement(By.xpath(XPATH_SELECT)).isDisplayed());

        WebElement webCookies = driver.findElement(By.xpath(XPATH_SELECT));
        webCookies.click();

        WebElement webLogin = driver.findElement(By.xpath(XPATH_SELECT1));
        webLogin.click();

        Thread.sleep(3000);

        WebElement dayOfBirth = driver.findElement(By.xpath(XPATH_DAY));
        Select dayOfBirthSelect = new Select(dayOfBirth);
        dayOfBirthSelect.selectByIndex(20);

        WebElement monthOfBirth = driver.findElement(By.xpath(XPATH_MONTH));
        Select monthOfBirthSelect = new Select(monthOfBirth);
        monthOfBirthSelect.selectByIndex(5);

        WebElement yearOfBirth = driver.findElement(By.xpath(XPATH_YEAR));
        Select yearOfBirthSelect = new Select(yearOfBirth);
        yearOfBirthSelect.selectByValue("1993");

    }
}
