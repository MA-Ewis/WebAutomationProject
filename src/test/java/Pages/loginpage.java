package Pages;

import Steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
    public WebDriver driver= Hooks.driver;

    public WebElement SIGN_UP_LOGIN_BUTTON() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(By.xpath("//a[@href=\"/login\"]"));
    }

    public WebElement ENTER_EMAIL() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
    }

    public WebElement ENTER_PASSWORD() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
    }

    public WebElement LOGIN_BUTTON() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));
    }







}
