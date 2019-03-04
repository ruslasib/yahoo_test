package tests;

import org.testng.annotations.Test;
import yahoomodels.NewMessageData;

public class SendMailTest extends TestBase {

  @Test
  public void testSendMail() {
    yahooPage.clickComposeButton();
    yahooPage.fillNewMessageFields(new NewMessageData("ruslasib@yahoo.com", "Have you got some coffee?", "I need you send me small package of coffee today. Please do it asap."));
    yahooPage.clickSendButton();
  }
}
