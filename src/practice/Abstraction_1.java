package practice;

//Base Class
abstract class Account{
  protected String name;
  Account(String name){
      this.name=name;
  }
  abstract void login();
}

//capabilities
interface Emailnotificable{
  void notify();
}
interface SmsNoticiable{
  void SendSms();
}
interface PushNotifiable{
  void PushNotification();
}
//Helper classes
class EmailSender{
  void Email(){
      System.out.println("email Sent");
  }
}
class SmsSender{
  void Sms(){
      System.out.println("SMS sent");
  }
}
class PushSender{
  void push(){
      System.out.println("Push Notification");
  }
}

//delegations
class User extends Account implements Emailnotificable, PushNotifiable{
  User(String name){
      super(name);
  }
  private final EmailSender emailsender=new EmailSender();
  private final PushSender pushsender=new PushSender();
  @Override
  void notify(){
      emailsender.Email();
  }
  @Override
  void PushNotification(){
      pushsender.push();
  }

class Admin extends Account implements Emailnotificable, PushNotifiable, SmsNoticiable{
  Admin(String name){
      super(name);
  }
  private final EmailSender emailsender= new EmailSender();
  private final PushSender pushsender= new PushSender();
  private final SmsSender smssender= new SmsSender();

  @Override
  void notify(){
      emailsender.Email();
  }
  @Override
  void PushNotification(){
      pushsender.push();
  }
  @Override
  void SendSms(){
      smssender.Sms();
  }
}

class SystemBot extends Account{
  SystemBot(String name){
      super(name);
  }
}


}
public class Abstraction_1 {
  public static void main(String[] args){
      

  }
}
