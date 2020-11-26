
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Vector<NotificationTemplate> templatesContainer=new Vector<>();
        Vector<Notification> notificationsContainer=new Vector<>();

        String[] placeholder1={"Abdulrahman","create"};
        NotificationTemplate template1=new NotificationTemplate("Forget password","Dear * we will * new password for you  ","English",Type.ForgetPassword,Channels.SMS);
        templatesContainer.add(template1);
        Notification notification1=new Notification(template1,placeholder1);

        notification1.formattingNotification();
        System.out.println( notification1.getFormattedNotification());

        notificationsContainer.add(notification1);

        System.out.println(".......................................................................................");

        String[] placeholder2={"Bishoy","mobile charger"};
        NotificationTemplate template2=new NotificationTemplate(" Booking an item ","Dear * ,your booking of the * is confirm ,thank you ","English",Type.Booking,Channels.Email);
        templatesContainer.add(template2);

        Notification notification2=new Notification(template2,placeholder2);

        notification2.formattingNotification();
        System.out.println(notification2.getFormattedNotification());
        notificationsContainer.add(notification2);

        System.out.println("........................................................................................");

        String[] placeholder3={" Saeed","your confirm email"};

        NotificationTemplate template3=new NotificationTemplate(" confirm your email ","Dear * , * is done ,thank you ","English",Type.ConfirmEmail,Channels.Email);
        templatesContainer.add(template3);
        Notification notification3=new Notification(template3,placeholder3);

        notification3.formattingNotification();
        System.out.println(notification3.getFormattedNotification());

        notificationsContainer.add(notification3);
    }
}
