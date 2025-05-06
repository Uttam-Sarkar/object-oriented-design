public class FactoryMainDemo {

    public static void main(String[] args) {
        FactoryNotification noti = new FactoryNotification();
        Notification noti1 = noti.getNotification("SMSNotification");
        Notification noti2 = noti.getNotification("EmailNotification");
        Notification noti3 = noti.getNotification("PushNotification");

        noti1.send_notification();
        noti2.send_notification();
        noti3.send_notification();

    }
}