package tests;

import org.testng.annotations.Test;
import yahoomodels.NewMessageData;

public class SaveMailDraftTest extends TestBase {

  @Test
  public void testSaveMailDraft() {
    yahooPage.clickComposeButton();
    yahooPage.fillNewMessageFields((new NewMessageData("vizhevske@mail.ru", "Draft", "Hello!\n" + "It's draft of a mail.")));
    yahooPage.clickDraftButton();
  }
}
