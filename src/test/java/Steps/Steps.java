package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

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
	
	
	@BeforeTest
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
	
	@AfterTest
	public void tearDown() {
		this.driver.close();
	}

}
