public class Notification {
    private String ID;
    private NotificationTemplate content;
    private String formattedNotification;

    public Notification(String ID, NotificationTemplate content, String formattedNotification) {
        this.ID = ID;
        this.content = content;
        this.formattedNotification = formattedNotification;
    }
    public Notification() {
        ID = null;
        content = null;
        formattedNotification = null;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public NotificationTemplate getContent() {
        return content;
    }

    public void setContent(NotificationTemplate content) {
        this.content = content;
    }

    public String getFormattedNotification() {
        return formattedNotification;
    }

    public void setFormattedNotification(String formattedNotification) {
        this.formattedNotification = formattedNotification;
    }

    public void formattingNotification(){


    }

}
