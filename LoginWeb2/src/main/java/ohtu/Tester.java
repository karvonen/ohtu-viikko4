package ohtu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Tester {

    public static void main(String[] args) {
//        WebDriver driver = new HtmlUnitDriver();
        WebDriver driver = new FirefoxDriver();

//        loginSuccess(driver);
//        loginFailureWithWrongPassword(driver);
//        loginFailureWithWrongPassword(driver);
//        loginFailureWithNonexistantUser(driver);
//        createNewUser(driver);
//        logoutAfterUserCreation(driver);
    }

    public static void loginSuccess(WebDriver driver) {
        driver.get("http://localhost:8090");
        System.out.println(driver.getPageSource());
        WebElement element = driver.findElement(By.linkText("login"));
        element.click();

        System.out.println("==");

        System.out.println(driver.getPageSource());
        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("akkep");
        element = driver.findElement(By.name("login"));
        element.submit();

        System.out.println("==");
        System.out.println(driver.getPageSource());
    }

    private static void loginFailureWithWrongPassword(WebDriver driver) {
        driver.get("http://localhost:8090");
        System.out.println(driver.getPageSource());
        WebElement element = driver.findElement(By.linkText("login"));
        element.click();

        System.out.println("==");

        System.out.println(driver.getPageSource());
        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("akkep1234");
        element = driver.findElement(By.name("login"));
        element.submit();

        System.out.println("==");
        System.out.println(driver.getPageSource());
    }

    private static void loginFailureWithNonexistantUser(WebDriver driver) {
        driver.get("http://localhost:8090");
        System.out.println(driver.getPageSource());
        WebElement element = driver.findElement(By.linkText("login"));
        element.click();

        System.out.println("==");

        System.out.println(driver.getPageSource());
        element = driver.findElement(By.name("username"));
        element.sendKeys("lllllllllllllll");
        element = driver.findElement(By.name("password"));
        element.sendKeys("akkep1234");
        element = driver.findElement(By.name("login"));
        element.submit();

        System.out.println("==");
        System.out.println(driver.getPageSource());
    }

    private static void createNewUser(WebDriver driver) {
        driver.get("http://localhost:8090");
        System.out.println(driver.getPageSource());
        WebElement element = driver.findElement(By.linkText("register new user"));
        element.click();

        System.out.println("==");

        System.out.println(driver.getPageSource());
        element = driver.findElement(By.name("username"));
        element.sendKeys("testUser");
        element = driver.findElement(By.name("password"));
        element.sendKeys("testUserPw1");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("testUserPw1");
        element = driver.findElement(By.name("add"));
        element.submit();

        System.out.println("==");
        System.out.println(driver.getPageSource());
    }

    private static void logoutAfterUserCreation(WebDriver driver) {
        System.out.println(driver.getPageSource());
        WebElement element = driver.findElement(By.linkText("continue to application mainpage"));
        element.click();

        System.out.println("==");
        element = driver.findElement(By.linkText("logout"));
        element.click();

        System.out.println("==");
        System.out.println(driver.getPageSource());
    }

}
