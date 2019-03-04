package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import yahoomanager.YahooPage;

public class TestBase {

  protected final YahooPage yahooPage = new YahooPage();

  @BeforeMethod
  public void setUp() {
    yahooPage.init();
  }

  @AfterMethod
  public void tearDown() {
    yahooPage.stop();
  }

}
