package tests;

import org.testng.annotations.Test;

public class DeleteIncomeMailTest extends TestBase {

  @Test
  public void testDeleteIncomeMail() {
    yahooPage.getYahooLeftMenu().clickIncomeMailButton();
    yahooPage.clickSingleMessageCheckbox();
    yahooPage.clickDeleteButton();
  }
}
