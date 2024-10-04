package com.practice.tests.pac_02_locators_getText_getAttribute;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class P02_ClickLinkWithText {
    @Test
    public void test1(){
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://practice.cydeo.com/");
        //page.setViewportSize(1080,1920);
        page.click("text=Autocomplete");
        page.waitForTimeout(3000);
        System.out.println(page.title());
        assertTrue(page.title().contains("Auto"));
        page.close();
        browser.close();
        playwright.close();

    }
}
