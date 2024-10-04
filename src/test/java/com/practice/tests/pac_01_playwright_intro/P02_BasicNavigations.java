package com.practice.tests.pac_01_playwright_intro;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class P02_BasicNavigations {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://practice.cydeo.com/");
        page.waitForTimeout(3000);

        page.navigate("http://www.google.com");
        page.waitForTimeout(3000);
        page.goBack();
        page.waitForTimeout(3000);
        page.goForward();
        page.waitForTimeout(3000);
        page.reload();
        page.waitForTimeout(3000);


        page.close();
        browser.close();
        playwright.close();
    }
}
