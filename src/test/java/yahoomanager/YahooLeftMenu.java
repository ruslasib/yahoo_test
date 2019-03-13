package yahoomanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YahooLeftMenu extends YahooBase {

  public YahooLeftMenu(WebDriver wd) {
    super(wd);
  }

  public void clickComposeButton() {
    click(By.xpath("//*[@data-test-id='compose-button']"));
  }

  public void clickIncomeMailButton() {
    click(By.xpath("//*[@data-test-folder-name='Inbox']"));
  }

  public void clickSentMailButton() {
    click(By.xpath("//*[@data-test-folder-name='Sent']"));
  }

  public void clickDraftButton() {
    click(By.xpath("//*[@data-test-id='folder-list-item']"));
  }
}
