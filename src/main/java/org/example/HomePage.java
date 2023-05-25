package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HomePage extends Utils {
    LoadProp loadProp = new LoadProp();
    private By _registerButton = By.xpath("//a[@class = 'ico-register']");

    private By _addToCartAppleMacBook = By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/button[1]");
    private By _buildYourOwnComputerAddToCart = By.xpath("//div[contains(@class,'product-grid')]//button[1]");
     String expectedAfterHoverColor = "rgba(74, 178, 241, 1)";
//public String expectedBeforeHoverColor = rgba(85, 85, 85, 1);
    String expectedWelcomeMessage = loadProp.getProperty("expectedWelcomeMessage");

    public void clickOnRegisterButton() {
        //click on register button
        clickOnTheElement(_registerButton);
    }


    public void addToCartAppleMacBook() {
        //click on add to cart of Apple MacBook
        clickOnTheElement(_addToCartAppleMacBook);
    }
    public void addToCartBuildYourOwnComputer(){
        //click on product
        clickOnTheElement(_buildYourOwnComputerAddToCart);

    }


    public void verifyHomepageURL() {
        // Assert to verify the homepage url
        Assert.assertEquals(driver.getCurrentUrl(), loadProp.getProperty("url"), "Url does not match");


    }
    public void hoverOverCategoryButton(String categoryName){
        WebElement element = driver.findElement(By.linkText(categoryName));
        System.out.println("Before hover color of category: "+element.getCssValue("color"));
        //creating object of an Action class
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        //performing the mouse hover action on the target element
       // action.moveToElement(ele).perform();
        //assert before and after hover
       // Assert.assertEquals(element.getCssValue("color"),);
        System.out.println("After hover color of category: "+ element.getCssValue("color"));
        //perform another move to element and click action


        //verify sub url

    }
    public void verifySubCategory(String subCategory){
        clickOnTheElement(By.linkText(subCategory));
    }
    public void verifySubCategoryPage(String page){
        Assert.assertTrue(getCurrentURL().contains(page));
    }
//    private String getCurrentUrl() {
//        Assert.assertEquals();
//
//    }
//  private String getCurrentUrl() {
//
//  }


    }
//}