package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Pages.Cart;
import Pages.Contact;
import Pages.Home;
import Pages.Shop;

public class Steps {
	

	public String baseURL = "https://practice.automationbro.com/";

	private String driverPath = "src/test/resources/drivers/chromedriver";
	protected WebDriver driver;
	protected Home home;
	protected Shop shop;
	protected Contact contact;
	protected Cart cart;
	ExtentReports report;
	ExtentTest test;
	
	@BeforeSuite(alwaysRun = true)
	public void report() {
		report = new ExtentReports("/Users/monicasanchez/test.html");
		test = report.startTest("Verify Welcome Text");
		test.log(LogStatus.INFO, "Browser Started");
		
	}
	
	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		this.driver = new ChromeDriver();
		this.home = new Home(this.driver);
		this.shop = new Shop(this.driver);
		this.contact = new Contact(this.driver);
		this.cart = new Cart(this.driver);
		this.driver.get(baseURL);
		this.driver.manage().window().maximize();

	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		this.driver.close();
	}

}
