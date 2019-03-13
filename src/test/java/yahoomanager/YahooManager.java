package yahoomanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import static java.util.concurrent.TimeUnit.SECONDS;

public class YahooManager {

  private WebDriver wd;
  private YahooNewMessage yahooNewMessage;
  private YahooLeftMenu yahooLeftMenu;
  private YahooSession yahooSession;
  private YahooMessageMenu yahooMessageMenu;

  private String browser;
  public YahooManager(String browser) {
    this.browser = browser;
  }

  public void init() {
    browserDefining(browser);
    wd.manage().timeouts().implicitlyWait(5, SECONDS);
    wd.manage().window().maximize();
    wd.get("https://www.yahoo.com/");
    yahooLeftMenu = new YahooLeftMenu(wd);
    yahooNewMessage = new YahooNewMessage(wd);
    yahooSession = new YahooSession(wd);
    yahooMessageMenu = new YahooMessageMenu(wd);
    yahooSession.authorize("ruslasib@yahoo.com", "2sinYcosH");
  }

  private WebDriver browserDefining(String browser) {
    if (browser.equals(BrowserType.CHROME)) {
      wd = new ChromeDriver();
    }
    else if (browser.equals(BrowserType.FIREFOX)) {
      wd = new FirefoxDriver();
    }
    else if (browser.equals(BrowserType.EDGE)) {
      wd = new EdgeDriver();
    }
    return wd;
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
