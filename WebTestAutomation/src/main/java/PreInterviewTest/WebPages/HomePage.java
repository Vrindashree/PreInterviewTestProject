package PreInterviewTest.WebPages;

import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;

public class HomePage {

	Page page;

	private String search = "//input[@aria-label='Search for a school']";
	private String searchButton = "//button[@id='searchPostcodeButton']";
	private String contactGroup = "//li/h2/strong[text()='Contact Group']/..//following-sibling::div/p[text()='Active']";

	public HomePage(Page page) {
		this.page = page;
	}

	public String getPageTitle() {
		return page.title();
	}

	public boolean search(String searchValue) {
		page.fill(search, searchValue);
		page.click(searchButton);
		page.waitForSelector(contactGroup);
		Boolean searchResultPresent = page.isVisible(contactGroup);
		return searchResultPresent;
	}
}