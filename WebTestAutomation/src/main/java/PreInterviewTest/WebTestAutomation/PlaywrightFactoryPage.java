package PreInterviewTest.WebTestAutomation;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightFactoryPage {
	Playwright playwright;
	Browser browser;
	BrowserContext browserContext;
	Page page;

	public Page initBrowser(String browsername) {
		System.out.println("Browser name is : " + browsername);
		playwright = Playwright.create();
		switch (browsername.toLowerCase()) {
		case "chromium":
			browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			break;
		case "chrome":
			browser = playwright.chromium()
					.launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
			break;
		case "firefox":
			browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
			break;
		default:
			break;
		}
		browserContext = browser.newContext();
		page = browserContext.newPage();
		page.navigate("https://osa-web.t-cg.co.uk");
		return page;
	}
}