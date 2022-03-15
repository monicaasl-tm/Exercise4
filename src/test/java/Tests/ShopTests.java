package Tests;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Steps.Steps;

public class ShopTests extends Steps {

	//TC_RQ_-001_001_001
		@Test(groups = {"ShopPage"})
		public void searchProduct() {
			this.home.shopButton.click();
			this.shop.searchTextBox.sendKeys("wat");
			this.shop.searchButton.click();
			new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(this.shop.searchResults));
			AssertJUnit.assertTrue(this.shop.searchResults.isDisplayed());
			
		}
		
		
		//TC_RQ_-001_001_002
		@Test(groups = {"ShopPage"})
		public void searchErrorMessage() {
			this.home.shopButton.click();
			this.shop.searchTextBox.sendKeys("blouse");
			this.shop.searchButton.click();
			new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(shop.searchResultsError));
			AssertJUnit.assertTrue(this.shop.searchResultsError.isDisplayed());
			
		}
		
		//TC_RQ_-003_001_001
		@Test(groups = {"ShopPage"})
		public void nineItemsPerPage(){
			
			this.home.shopButton.click();
			AssertJUnit.assertTrue(this.shop.resultNineItems.isDisplayed());
			
			}
		
		//TC_RQ_-004_001_001
		@Test(groups = {"ShopPage"})
		public void productCategories() {
			
			this.home.shopButton.click();
			AssertJUnit.assertTrue(this.shop.categories.size()>1);
			
			}
		
		//TC_RQ_-004_001_002
		@Test(groups = {"ShopPage"})
		public void categoryClothes() {
			
			this.home.shopButton.click();
			this.shop.categoryClothes.click();
			AssertJUnit.assertTrue(this.shop.clothesPage.isDisplayed());
			
			}
		
		//TC_RQ_-005_001_001
		@Test(groups = {"ShopPage"})
		public void recentViewedProducts() throws InterruptedException {
			

			this.home.shopButton.click();
			this.shop.selectConverse.click();
			this.home.shopButton.click();
			this.driver.navigate().refresh();
			new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(shop.recentlyViewedProducts));
			boolean exist = false;
			for(WebElement e : this.shop.recentlyViewed) {
				if(e.getText().contains("Converse")) {
					exist = true;
					break;
				}
			}
			AssertJUnit.assertTrue(exist);
			
			}

}
