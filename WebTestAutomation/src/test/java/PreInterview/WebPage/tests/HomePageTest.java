package PreInterview.WebPage.tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.microsoft.playwright.Page;

import PreInterviewTest.WebPages.HomePage;
import PreInterviewTest.WebTestAutomation.PlaywrightFactoryPage;

public class HomePageTest {

	PlaywrightFactoryPage pf;
	Page page;
	HomePage homepage;
	String expectedHeader = "OurSchoolsApp";
	String searchValue = "B16 8PE";

	@BeforeTest
	public void setup() {
		pf = new PlaywrightFactoryPage();
		page = pf.initBrowser("chrome");
		homepage = new HomePage(page);
	}

	// Verify that user is on home page/search page
	@Test
	public void verifyUserIsOnHomePage() {
		String actualTitle = homepage.getPageTitle();
		Assert.assertEquals(actualTitle, expectedHeader);
	}

	// Verify that user search is success and search results returned
	@Test
	public void searchText() {
		boolean searchResultHeader = homepage.search(searchValue);
		Assert.assertTrue(searchResultHeader);
		System.out.println("User searched for text '" + searchValue + "' and search results displayed");
	}

	@AfterTest
	public void driverClose() {
		page.context().browser().close();
	}
}