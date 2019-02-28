import org.testng.annotations.Test;

public class DeleteIncomeMailTest extends TestBase {

  @Test
  public void testDeleteIncomeMail() {
    clickIncomeMailButton();
    clickSingleMessageCheckbox();
    clickDeleteButton();
  }
}
