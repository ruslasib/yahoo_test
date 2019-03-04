package tests;

import org.testng.annotations.Test;
import yahoomodels.NewMessageData;

public class SendMailTest extends TestBase {

  @Test
  public void testSendMail() {
<<<<<<< HEAD
    yahooManager.getYahooLeftMenu().clickComposeButton();
    yahooManager.getYahooMessageCreating().fillNewMessageFields(new NewMessageData("ruslasib@yahoo.com", "Have you got some coffee?", "I need you send me small package of coffee today. Please do it asap."));
    yahooManager.getYahooMessageCreating().clickSendButton();
=======
    yahooPage.authorize("ruslasib@yahoo.com", "2sinYcosH");
    yahooPage.clickComposeButton();
    yahooPage.fillNewMessageFields(new NewMessageData("ruslasib@yahoo.com", "Have you got some coffee?", "I need you send me small package of coffee today. Please do it asap."));
    yahooPage.clickSendButton();
>>>>>>> parent of a0d3a35... Создан тест для проверки базового поиска писем
  }
}
