package yahoomanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import yahoomodels.NewMessageData;

public class YahooMessageCreating {

  ChromeDriver wd;
  public YahooMessageCreating(ChromeDriver wd) {
    this.wd = wd;
  }
  private final YahooLeftMenu yahooLeftMenu = new YahooLeftMenu();

  public void fillNewMessageFields(NewMessageData newMessage) {
    wd.findElement(By.id("message-to-field")).click();
    wd.findElement(By.id("message-to-field")).sendKeys(newMessage.getRecipient());
    wd.findElement(By.xpath("//input[@data-test-id='compose-subject']")).click();
    wd.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys(newMessage.getSubject());
    wd.findElement(By.xpath("//*[@id=\"editor-container\"]/div[1]")).click();
    wd.findElement(By.xpath("//*[@id=\"editor-container\"]/div[1]")).sendKeys(newMessage.getMessage());
  }

  public void clickSendButton() {
    yahooLeftMenu.wd.findElement(By.xpath("//button[@data-test-id='compose-send-button']")).click();
  }
}
