package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shop {

	// Page Factory Web Elements
	public Shop(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Mapeo
		
		@FindBy(xpath = "//input[@id='woocommerce-product-search-field-0']")
		public WebElement searchTextBox;
		
		@FindBy(xpath = "//body/div[@id='page']/main[@id='main']/div[@id='content']/div[1]/div[1]/ul[1]/li[2]/a[2]")
		public WebElement addSkirt;
		
		@FindBy(xpath = "//a[@aria-label='Add “Zurich Watch” to your cart']")
		public WebElement addZurWatch;
		
		@FindBy(xpath = "//body/div[@id='page']/main[@id='main']/div[@id='content']/div[1]/div[1]/ul[1]/li[3]/a[2]")
		public WebElement addConverse;
		
		@FindBy(xpath = "//body/div[@id='page']/main[@id='main']/div[@id='content']/div[1]/div[1]/ul[1]/li[4]/a[2]")
		public WebElement addHeadphones;
		
		@FindBy(xpath = "//a[contains(text(),'View cart')]")
		public WebElement viewCart;
		
		@FindBy(xpath = "//button[@type='submit']")
		public WebElement searchButton;
		
		@FindBy(xpath = "//p[contains(text(),'Showing all 2 results')]")
		public WebElement searchResults;
		
		@FindBy(xpath = "//p[contains(text(),'No products were found matching your selection.')]")
		public WebElement searchResultsError;
		
		@FindBy(xpath = "//p[contains(text(),'Showing 1–9 of 11 results')]")
		public WebElement resultNineItems;
		
		@FindBy(xpath = "//ul[@class='product-categories']/li")
		public List<WebElement> categories;
		
		@FindBy(linkText = "Clothes")
		public WebElement categoryClothes;
		
		@FindBy(xpath = "//h1[contains(text(),'Clothes')]")
		public WebElement clothesPage;
		
		@FindBy(xpath = "//body/div[@id='page']/main[@id='main']/div[@id='content']/div[1]/div[1]/ul[1]/li[3]/a[1]/h2[1]")
		public WebElement selectConverse;
		
		@FindBy(xpath = "//h2[contains(text(),'Recently Viewed Products')]")
		public WebElement recentlyViewedProducts;
		
		@FindBy(xpath = "//section[@id='woocommerce_recently_viewed_products-1']/ul/child::*")
		public List<WebElement> recentlyViewed;
		
		@FindBy(xpath = "//span[@class='price']/child::*")
		public List<WebElement> productPrice;
		
		@FindBy(xpath = "//select[@class='orderby']")
		public WebElement defaultSorting;
		
		@FindBy(xpath = "//option[@value='price']")
		public WebElement sortByPrice;
		
}

