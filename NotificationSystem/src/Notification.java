
public class Notification {
    private NotificationTemplate content;
    private String formattedNotification;
    private String[]  placeholders;

    public Notification(NotificationTemplate content,   String[] placeholders) {
        this.content = content;
        this.placeholders = placeholders;
        this.formattedNotification = "";
    }
    public Notification() {
        content = null;
        formattedNotification = null;
        placeholders = null;
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
    public String[] getPlaceholders() {
        return placeholders;
    }

    public void setPlaceholders(String[] placeholders) {
        this.placeholders = placeholders;
    }

    public void formattingNotification(){
        String Not=content.getContent();
        int j=0;
        for (int i = 0; i <Not.length() ; i++){
            if(Not.charAt(i)=='*')
            {
                String str1=Not.substring(0,i);
                String str2= Not.substring(i+1,Not.length());
                str1+=placeholders[j];
                Not=str1+str2;
                i+=placeholders[j].length();
                j++;
            }
        }
        String message = "";
        message +=  ("Subject : " + content.getSubject() +"\n");
        message += ("Language : " + content.getLanguage() +"\n");
        message += ("Notification Type : " + content.getType() +"\n");
        message += ("Channels : " + content.getChannels() +"\n");
        message +=  ("Content : " + Not  + "\n");
        setFormattedNotification(message);
    }

}