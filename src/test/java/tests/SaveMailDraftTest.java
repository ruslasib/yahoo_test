package tests;

import org.testng.annotations.Test;
import yahoomodels.NewMessageData;

public class SaveMailDraftTest extends TestBase {

  @Test
  public void testSaveMailDraft() {
    yahooPage.getYahooLeftMenu().clickComposeButton();
    yahooPage.getYahooNewMessage().fillNewMessageFields((new NewMessageData("vizhevske@mail.ru", "Draft", "Hello!\n" + "It's draft of a mail.")));
    yahooPage.getYahooLeftMenu().clickDraftButton();
  }
}
