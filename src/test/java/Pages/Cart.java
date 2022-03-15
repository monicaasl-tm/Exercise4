package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	
	
	// Page Factory Web Elements
	public Cart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	

	@FindBy(xpath = "//table[@class='shop_table shop_table_responsive cart woocommerce-cart-form__contents']")
	public WebElement tableCart;
	
	@FindBy(xpath = "//td[@class='product-name']")
	public WebElement productName;

	
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
