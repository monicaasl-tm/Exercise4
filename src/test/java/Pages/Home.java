package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	private WebDriver driver;
	
	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(linkText = "Shop")
	public WebElement shopButton;
	
	@FindBy(linkText = "Contact")
	public WebElement contactButton;

	//
	
	@FindBy(xpath = "//body/div[@id='page']/main[@id='main']/div[@id='content']/div[1]/div[1]/ul[1]/li[2]/a[2]")
	public WebElement addSkirt;
	
	@FindBy(xpath = "//a[contains(text(),'View cart')]")
	public WebElement viewCart;

	@FindBy(xpath = "//table[@class='shop_table shop_table_responsive cart woocommerce-cart-form__contents']")
	public WebElement tableCart;
	
	@FindBy(xpath = "//td[@class='product-name']")
	public WebElement productName;
	
	@FindBy(xpath = "//body/div[@id='page']/main[@id='main']/div[@id='content']/div[1]/div[1]/ul[1]/li[1]/a[2]")
	public WebElement addZurWatch;
	
	@FindBy(xpath = "//body/div[@id='page']/main[@id='main']/div[@id='content']/div[1]/div[1]/ul[1]/li[3]/a[2]")
	public WebElement addConverse;
	
	@FindBy(xpath = "//body/div[@id='page']/main[@id='main']/div[@id='content']/div[1]/div[1]/ul[1]/li[4]/a[2]")
	public WebElement addHeadphones;
	
	@FindBy(xpath = "//table[@class='shop_table shop_table_responsive cart woocommerce-cart-form__contents']/tbody/tr")
	public List<WebElement> tableProducts;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/a[1]")
	public WebElement removeProduct;
	
	@FindBy(xpath = "//body/div[@id='page']/main[@id='main']/div[@id='content']/div[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[1]")
	public WebElement removedMessage;
	
	@FindBy(xpath = "//a[contains(text(),'Proceed to checkout')]")
	public WebElement checkOutButton;
	
	@FindBy(xpath = "//h3[contains(text(),'Billing details')]")
	public WebElement billingDetails;
	
	
}
