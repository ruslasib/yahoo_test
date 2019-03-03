import org.testng.annotations.Test;

public class SendMailTest extends TestBase {

  @Test
  public void testSendMail() {
    authorize("ruslasib@yahoo.com", "2sinYcosH");
    clickComposeButton();
    fillNewMessageFields(new NewMessageData("ruslasib@yahoo.com", "Have you got some coffee?", "I need you send me small package of coffee today. Please do it asap."));
    clickSendButton();
  }
}
