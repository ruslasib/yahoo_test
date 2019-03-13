package yahoomanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

public class YahooManager {

  private WebDriver wd;
  private YahooNewMessage yahooNewMessage;
  private YahooLeftMenu yahooLeftMenu;
  private YahooSession yahooSession;
  private YahooMessageMenu yahooMessageMenu;

  public void init() {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(5, SECONDS);
    wd.manage().window().maximize();
    wd.get("https://www.yahoo.com/");
    yahooLeftMenu = new YahooLeftMenu(wd);
    yahooNewMessage = new YahooNewMessage(wd);
    yahooSession = new YahooSession(wd);
    yahooMessageMenu = new YahooMessageMenu(wd);
    yahooSession.authorize("ruslasib@yahoo.com", "2sinYcosH");
  }

  public void stop() {
    wd.quit();
  }

  public YahooNewMessage getYahooNewMessage() {
    return yahooNewMessage;
  }

  public YahooLeftMenu getYahooLeftMenu() {
    return yahooLeftMenu;
  }

  public YahooMessageMenu getYahooMessageMenu() {
    return yahooMessageMenu;
  }
}
