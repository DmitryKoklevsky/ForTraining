package automationFramework;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

public class BokinTest {

	private WebDriver driver;
	private double expecderResult = 9.0;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() {
	}

	@Ignore
	@Test
	public void ExistHotelsTest() {
		driver.get("https://www.booking.com");
		WebElement searchField = driver.findElement(By
				.xpath("//input[@id='ss']"));
		searchField.clear();
		searchField.sendKeys("Москва");
		WebElement buttonSearch = driver
				.findElement(By
						.xpath("//div[contains(@class,'sb-searchbox-submit-col -submit-button')]//button[@type='submit']"));
		buttonSearch.click();
		WebElement groupAdults = driver.findElement(By
				.xpath("//select[@name='group_adults']"));
		Select selectAdults = new Select(groupAdults);
		selectAdults.selectByIndex(1); // select 2 adults
		WebElement groupRoom = driver.findElement(By
				.xpath("//select[@id='no_rooms']"));
		Select selectRoom = new Select(groupRoom);
		selectRoom.selectByIndex(0); // select one room
		WebElement buttonSearchOnPageWithResult = driver
				.findElement(By
						.xpath("//div[contains(@class,'sb-searchbox-submit-col -submit-button')]//button[@type='submit']"));
		buttonSearchOnPageWithResult.click();
		WebElement hotelBloc = driver.findElement(By
				.xpath("//div[@data-et-view = ' eWHJbWPNZWEHXT:5']"));
		assertTrue(hotelBloc.isDisplayed());
	}

	@Test
	public void HotelsRatingTest() throws InterruptedException {
		
		driver.get("https://www.booking.com");
		driver.manage().window().maximize();
		WebElement searchField = driver.findElement(By
				.xpath("//input[@id='ss']"));
		searchField.clear();
		searchField.sendKeys("Москва");
		WebElement buttonSearch = driver
				.findElement(By
						.xpath("//div[contains(@class,'sb-searchbox-submit-col -submit-button')]//button[@type='submit']"));
		buttonSearch.click();
		WebElement groupAdults = driver.findElement(By
				.xpath("//select[@name='group_adults']"));
		Select selectAdults = new Select(groupAdults);
		selectAdults.selectByIndex(1); // select 2 adults
		WebElement groupRoom = driver.findElement(By
				.xpath("//select[@id='no_rooms']"));
		Select selectRoom = new Select(groupRoom);
		selectRoom.selectByIndex(0); // select one room
		WebElement sortByRaiting = driver.findElement(By
				.xpath("//a[@data-category = 'bayesian_review_score']"));
		sortByRaiting.click();
		driver.navigate().refresh();
		List<WebElement> listOfHotels = driver.findElements(By
				.xpath("//a[@class= 'hotel_name_link url']"));
		WebElement hotel = listOfHotels.get(0);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", hotel);
		Set<String> windows = driver.getWindowHandles();
		for (String winHandle : windows) {
			driver.switchTo().window(winHandle);
		}
		WebElement GuestReview = driver
				.findElement(By
						.xpath("//div[contains(@class,'hp_nav_bar_wrapper hp-nav-bottom-border')]//span[1]"));
		GuestReview.click();
		WebElement mark = driver
				.findElement(By
						.xpath("/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/span[1]/span[1]"));
		mark.getText();
		double d = Double.parseDouble(mark.getText());
		Assert.assertTrue(d >= expecderResult);
	}

}
