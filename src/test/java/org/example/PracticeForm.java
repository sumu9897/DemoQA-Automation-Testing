package org.example;

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
        System.out.println(browser.manage());
        System.out.println(browser.navigate());

    }

}
