
import java.util.Vector;

enum Type{
    ConfirmEmail,ForgetPassword,Booking
}
enum Channels{
    SMS,Email
}
public class NotificationTemplate {
    private String subject;
    private String content;
    private String language;
    private Type type;
    private Channels channels;

    public NotificationTemplate(String subject, String content, String language, Type type,Channels channels) {
        this.subject = subject;
        this.content = content;
        this.language = language;
        this.type = type;
        this.channels=channels;

    }
    public NotificationTemplate() {
        subject = null;
        content = null;
        language = null;
        type = null;
        channels=null;

    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Channels getChannels() {
        return channels;
    }

    public void setChannels(Channels channels) {
        this.channels = channels;
    }


    public void create(String subject, String content, String language, Type type,Channels channels){
        setSubject(subject);
        setContent(content);
        setLanguage(language);
        setType(type);
        setChannels(channels);
    }
    public void read(){
        System.out.println("Subject : " + getSubject());
        System.out.println("Content : " + getContent());
        System.out.println("Language : " + getLanguage());
        System.out.println("Notification Type : " + getType());
        System.out.println("Channels : " + getChannels());
    }
    public void updateSubject(String subject){
        setSubject(subject);
    }
    public void updateContent(String content){
        setContent(content);
    }
    public void updateLanguage(String language){
        setLanguage(language);
    }
    public void updateType(Type type){
        setType(type);
    }
    public void delete(Vector<Notification> notification){
        if (notification.contains(this)){
            int i = notification.indexOf(this);
            notification.remove(notification.elementAt(i));
        }
    }
}