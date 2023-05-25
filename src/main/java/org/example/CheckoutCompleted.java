package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckoutCompleted extends Utils{
    LoadProp loadProp = new LoadProp();
    private By _yourOrderProcessed = By.xpath("//div[@class='section order-completed']//div[@class='title']");
    String expectedThankYouMessage = loadProp.getProperty("expectedThankYouMessage") ;
   public void verifyCheckoutCompletePage(){
       System.out.println("URL :"+getCurrentURL());
       Assert.assertTrue(getCurrentURL().contains("checkout/completed"));
   }
    public void verifyOrderProceedMessage(){
        //capture the ThankYou message
        waitForElementToBeVisible(_yourOrderProcessed);
        String yourOrderProcessed = getTextFromElement(_yourOrderProcessed);
        System.out.println("Thank you message is: " + yourOrderProcessed);
        //Assert to verify the actual and expected
        Assert.assertEquals(yourOrderProcessed,expectedThankYouMessage,"Thank you for shopping");

    }
}
