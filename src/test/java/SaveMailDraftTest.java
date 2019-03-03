import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SaveMailDraftTest extends TestBase {

  @Test
  public void testSaveMailDraft() {
    clickComposeButton();
    fillNewMessageFields(new NewMessageData("vizhevske@mail.ru", "Draft", "Hello!\n" + "It's draft of a mail."));
    wd.findElement(By.xpath("//*[@data-test-folder-name='Draft']"));
    wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }
}
