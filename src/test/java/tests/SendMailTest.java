package tests;

import org.testng.annotations.Test;
import yahoomodels.NewMessageData;

public class SendMailTest extends TestBase {

  @Test
  public void testSendMail() {
    yahooManager.getYahooLeftMenu().clickComposeButton();
    yahooManager.getYahooNewMessage().fillNewMessageFields(new NewMessageData("ruslasib@yahoo.com", "Test1", "Test2"));
    yahooManager.getYahooNewMessage().clickSendButton();
  }
}