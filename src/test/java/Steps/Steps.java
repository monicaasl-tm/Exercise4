package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
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
	
	//Pasos comunes entre todos los test
	public String baseURL = "https://practice.automationbro.com/";

	private String driverPath = "src/test/resources/drivers/chromedriver";
	protected WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	public Home home;
	public Shop shop;
	public Cart cart;
	public Contact contact;
	
	
	@BeforeSuite(alwaysRun = true) //crear reporte
	public void report(ITestContext ctx) { //guarda atributos a lo largo de los tests
		report = new ExtentReports("/Users/monicasanchez/test.html"); //archivo que crea y donde lo guarda
		ctx.setAttribute("report", report); //se pone disponible al resto de los tests
		
	}

	@BeforeMethod(alwaysRun = true)
	public void initTest(ITestContext ctx) {
		this.report  = (ExtentReports) ctx.getAttribute("report");
		System.setProperty("webdriver.chrome.driver", driverPath);
		this.driver = new ChromeDriver();
		this.shop = new Shop(this.driver);
		this.cart = new Cart(this.driver);
		this.home = new Home(this.driver);
		this.contact = new Contact(this.driver);
		this.test = this.report.startTest(this.getClass() + " Test ");
		this.test.log(LogStatus.INFO, "Test Started");
		this.driver.get(this.baseURL);
		this.driver.manage().window().maximize();
		ctx.setAttribute("driver", this.driver);
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDownTest(ITestContext ctx) {
		
		this.test.log(LogStatus.INFO, "Test Finished");
		this.report.endTest(this.test);
		this.driver = (WebDriver) ctx.getAttribute("driver");
		this.driver.close();
	}
	

	@AfterSuite(alwaysRun = true)
	public void endReport(ITestContext  ctx) {
		this.report = (ExtentReports) ctx.getAttribute("report");
		report.flush();
		
	}

}
