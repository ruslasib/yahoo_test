package yahoomanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YahooLeftMenu {

  public void clickComposeButton() {
    wd.findElement(By.xpath("//a[@data-test-id='compose-button']")).click();
  }

  public void clickIncomeMailButton() {
    wd.findElement(By.xpath("//*[@data-test-folder-name='Inbox']")).click();
  }
}
