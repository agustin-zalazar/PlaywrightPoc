package org.example;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.LoadState;

import java.nio.file.Paths;
import java.util.Collections;

public class App 
{
    public static void main( String[] args )
    {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions()
                            .setHeadless(true)
                            .setArgs(Collections.singletonList("--no-sandbox"))
            );
            Page page = browser.newPage();
            page.navigate("https://www.afkl.biz/trade/s/resources-detail?Id=000001277&language=pt_PT&country=BR#");
            page.waitForLoadState(LoadState.NETWORKIDLE);  // esperar a que no haya más peticiones
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));
            System.out.println("Page content:" + page.content());
        }
    }
}
