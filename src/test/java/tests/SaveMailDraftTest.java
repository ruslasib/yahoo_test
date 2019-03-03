package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import yahoomodels.NewMessageData;

import java.util.concurrent.TimeUnit;

public class SaveMailDraftTest extends TestBase {

  @Test
  public void testSaveMailDraft() {
    yahooPage.clickComposeButton();
    yahooPage.fillNewMessageFields(new NewMessageData("vizhevske@mail.ru", "Draft", "Hello!\n" + "It's draft of a mail."));
    yahooPage.wd.findElement(By.xpath("//*[@data-test-folder-name='Draft']"));
    yahooPage.wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }
}
