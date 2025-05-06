public class FactoryNotification {

    public Notification getNotification (String notificationType){

        if(notificationType == null){
            return null;
        }

        if(notificationType.equalsIgnoreCase("SMSNotification") ){
            return new SMSNotification();
        }else if(notificationType.equalsIgnoreCase("EmailNotification") ){
            return new EmailNotification();
        } else if(notificationType.equalsIgnoreCase("PushNotification") ){
            return new PushNotification();
        }

        return null;
    }
}