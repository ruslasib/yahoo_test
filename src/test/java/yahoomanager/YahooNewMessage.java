package yahoomanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import yahoomodels.NewMessageData;

public class YahooNewMessage extends YahooPage{
  private WebDriver wd;

  public YahooNewMessage(WebDriver wd) {
    this.wd = wd;
  }

  public void fillNewMessageFields(NewMessageData newMessage) {
    wd.findElement(By.id("message-to-field")).click();
    wd.findElement(By.id("message-to-field")).sendKeys(newMessage.getRecipient());
    wd.findElement(By.xpath("//input[@data-test-id='compose-subject']")).click();
    wd.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys(newMessage.getSubject());
    wd.findElement(By.xpath("//*[@id=\"editor-container\"]/div[1]")).click();
    wd.findElement(By.xpath("//*[@id=\"editor-container\"]/div[1]")).sendKeys(newMessage.getMessage());
  }

  public void clickCloseAndSaveDraftButton() {
    wd.findElement(By.xpath("//*[@data-test-id='icon-btn-close']"));
  }

  public void clickSendButton() {
    wd.findElement(By.xpath("//button[@data-test-id='compose-send-button']")).click();
  }
}
