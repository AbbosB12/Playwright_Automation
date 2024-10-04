package com.practice.tests.pac_02_locators_getText_getAttribute;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Test;

public class P04_PlayWrightMethods {
    @Test
    public void test(){
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://library2.cybertekschool.com/login.html");
        page.getByPlaceholder("Email address",
                        //find the exactly that word
                        new Page.GetByPlaceholderOptions().setExact(true)).
                fill("librarian3@library");
//        page.getByPlaceholder("Password").fill("libraryUser");
        page.querySelector("#inputPassword").fill("libraryUser");
        page.click("button[type='submit']");
        page.waitForTimeout(3000);



        page.close();
        browser.close();
        playwright.close();
    }
}
