class NotificationsFactory{
    public static Notifications sendNotification(String type){
        if(type.equals("Email")) return new Email();
        else if(type.equals("Sms")) return new Sms();
        else throw new IllegalArgumentException("Invalid Type");
    }
}