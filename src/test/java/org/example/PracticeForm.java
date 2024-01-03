package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PracticeForm extends DriverSetup{

    @Test
    public void OpenPracticePage() throws InterruptedException {
        browser.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(2000);

        System.out.println(browser.getTitle());
        System.out.println(browser.getCurrentUrl());
//        System.out.println(browser.getPageSource());
        System.out.println(browser.getWindowHandle());
        System.out.println(browser.getWindowHandles());
        System.out.println(browser.switchTo());
        System.out.println(browser.manage());
        System.out.println(browser.navigate());

    }

    @Test
    public void PracticeFormPage() throws InterruptedException {
        browser.get("https://demoqa.com/automation-practice-form");
        WebElement firstName = browser.findElement(By.id("firstName"));
        firstName.sendKeys("Mohammad");
        Thread.sleep(500);

        WebElement lastName = browser.findElement(By.id("lastName"));
        lastName.sendKeys("Sumon");
        Thread.sleep(500);

        WebElement email = browser.findElement(By.xpath("(//input[@id='userEmail'])[1]"));
        email.sendKeys("mohammad.sumon9897@gmail.com");
        Thread.sleep(500);

        WebElement gender = browser.findElement(By.xpath("(//label[normalize-space()='Male'])[1]"));
        gender.click();
        Thread.sleep(200);

        WebElement phone = browser.findElement(By.id("userNumber"));
        phone.sendKeys("1631057540");

        WebElement dobDay = browser.findElement(By.id("dateOfBirthInput"));
        dobDay.clear();
        dobDay.sendKeys("25 October 1999");
        Thread.sleep(500);
        



    }

}
