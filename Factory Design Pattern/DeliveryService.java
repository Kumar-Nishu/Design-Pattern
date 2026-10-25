class DeliveryService{
    public void sendNotification(){
        Notifications notifications=NotificationsFactory.sendNotification("Email");
        notifications.Send();
    }
}