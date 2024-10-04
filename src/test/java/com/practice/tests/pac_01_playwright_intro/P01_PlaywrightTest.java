package com.practice.tests.pac_01_playwright_intro;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class P01_PlaywrightTest {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        /**By default, Playwright runs the browsers in headless mode.
         * To see the browser UI, pass the setHeadless(false) flag while launching the browser.
         * You can also use slowMo to slow down execution
      */
         Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("http://www.google.com");
        Thread.sleep(3000);
        page.close();
        browser.close();
        playwright.close();
//        page.navigate("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");

    }
}
