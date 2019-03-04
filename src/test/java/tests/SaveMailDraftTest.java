package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import yahoomodels.NewMessageData;

import java.util.concurrent.TimeUnit;

public class SaveMailDraftTest extends TestBase {

  @Test
  public void testSaveMailDraft() {
    yahooManager.getYahooLeftMenu().clickComposeButton();
    yahooManager.getYahooMessageCreating().fillNewMessageFields(new NewMessageData("vizhevske@mail.ru", "Draft", "Hello!\n" + "It's draft of a mail."));
    yahooManager.getYahooLeftMenu().wd.findElement(By.xpath("//*[@data-test-folder-name='Draft']"));
    yahooManager.getYahooLeftMenu().wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }
}
