package tests;

import org.testng.annotations.Test;

public class DeleteIncomeMailTest extends TestBase {

  @Test
  public void testDeleteIncomeMail() {
    yahooPage.clickIncomeMailButton();
    yahooPage.clickSingleMessageCheckbox();
    yahooPage.clickDeleteButton();
  }
}
