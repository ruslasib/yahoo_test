package yahoomanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import yahoomodels.NewMessageData;

public class YahooNewMessage extends YahooBase{

  public YahooNewMessage(WebDriver wd) {
    super(wd);
  }

  public void fillNewMessageFields(NewMessageData newMessage) {
    type(By.id("message-to-field"), newMessage.getRecipient());
    type(By.xpath("//input[@data-test-id='compose-subject']"), newMessage.getSubject());
    type(By.xpath("//*[@data-test-id='rte']"), newMessage.getMessage());
  }

  public void clickCloseAndSaveDraftButton() {
    click(By.xpath("//*[@data-test-id='icon-btn-close']"));
  }

  public void clickSendButton() {
    click(By.xpath("//button[@data-test-id='compose-send-button']"));
  }
}
