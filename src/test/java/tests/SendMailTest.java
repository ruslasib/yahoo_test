package tests;

import org.testng.annotations.Test;
import yahoomodels.NewMessageData;

public class SendMailTest extends TestBase {

  @Test
  public void testSendMail() {
    yahooPage.getYahooLeftMenu().clickComposeButton();
    yahooPage.getYahooNewMessage().fillNewMessageFields(new NewMessageData("ruslasib@yahoo.com", "Test1", "Test2"));
    yahooPage.yahooNewMessage.clickSendButton();
  }
}