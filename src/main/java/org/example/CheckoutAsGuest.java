package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckoutAsGuest extends Utils{
    private By _checkoutAsGuest = By.xpath("//button[@class='button-1 checkout-as-guest-button']");

   public void verifyCheckOutAsGuestPage(){
       System.out.println("URL :"+getCurrentURL());
       Assert.assertTrue(getCurrentURL().contains("login/checkoutasguest?returnUrl=%2Fcart"));
   }
    public void clickOnCheckoutAsGuest(){
        //click on checkout as guest
        clickOnTheElement(_checkoutAsGuest);

   }


}
