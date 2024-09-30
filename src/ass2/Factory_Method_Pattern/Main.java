package ass2.Factory_Method_Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factory Method Pattern:");
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification emailNotification = notificationFactory.createNotification("EMAIL");
        Notification smsNotification = notificationFactory.createNotification("SMS");
        emailNotification.notifyUser();
        smsNotification.notifyUser();
        System.out.println();
    }
}
