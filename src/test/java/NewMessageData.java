public class NewMessageData {
  private final String recipient;
  private final String subject;
  private final String message;

  public NewMessageData (String recipient, String subject, String message){
    this.recipient = recipient;
    this.subject = subject;
    this.message = message;
  }

  public String getRecipient() {
    return recipient;
  }

  public String getSubject() {
    return subject;
  }

  public String getMessage() {
    return message;
  }
}
