package tests;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SearchMailTest extends TestBase {

  @Test
  public void testSearchMailExists() {
    yahooPage.fillSearchMailBarBasic("vizhevske");
    yahooPage.clickSearchBasicBtn();
    Assert.assertTrue(yahooPage.isElementPresent("//*[@data-test-id='icon-btn-checkbox']"));
  }

  @Test
  public void testSearchMailNotExists() {
    yahooPage.fillSearchMailBarBasic("posdjhfsjkdsu");
    yahooPage.clickSearchBasicBtn();
    Assert.assertFalse(yahooPage.isElementPresent("//*[@data-test-id='icon-btn-checkbox']"));
  }
}