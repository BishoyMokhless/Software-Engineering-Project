import java.util.Vector;

enum Type{
    ConfirmEmail,ForgetPassword,Booking
}
enum Channels{

}
public class NotificationTemplate {
    private String subject;
    private String content;
    private String language;
    private Type type;
    private int numbersOfPlaceholders;
    private String[]  placeholders;

    public NotificationTemplate(String subject, String content, String language, Type type, int numbersOfPlaceholders, String[] placeholders) {
        this.subject = subject;
        this.content = content;
        this.language = language;
        this.type = type;
        this.numbersOfPlaceholders = numbersOfPlaceholders;
        this.placeholders = placeholders;
    }
    public NotificationTemplate() {
        subject = null;
        content = null;
        language = null;
        type = null;
        numbersOfPlaceholders = 0;
        placeholders = null;
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

    public int getNumbersOfPlaceholders() {
        return numbersOfPlaceholders;
    }

    public void setNumbersOfPlaceholders(int numbersOfPlaceholders) {
        this.numbersOfPlaceholders = numbersOfPlaceholders;
    }

    public String[] getPlaceholders() {
        return placeholders;
    }

    public void setPlaceholders(String[] placeholders) {
        this.placeholders = placeholders;
    }
    public void create(String subject, String content, String language, Type type, int numbersOfPlaceholders, String[] placeholders){
        setSubject(subject);
        setContent(content);
        setLanguage(language);
        setType(type);
        setNumbersOfPlaceholders(numbersOfPlaceholders);
        setPlaceholders(placeholders);

    }
    public void read(){
        System.out.println("Subject : " + getSubject());
        System.out.println("Content : " + getContent());
        System.out.println("Language : " + getLanguage());
        System.out.println("Notification Type : " + getType());
        System.out.println("Place holders : " + getPlaceholders());
        System.out.println("Number of Place holders : " + getNumbersOfPlaceholders());

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
    public void updatePlaceholders(String[] placeholders,int numbersOfPlaceholders){
        setPlaceholders(placeholders);
        setNumbersOfPlaceholders(numbersOfPlaceholders);
    }
    public void delete(Vector<Notification> notification){
        if (notification.contains(this)){
            int i = notification.indexOf(this);
            notification.remove(notification.elementAt(i));
        }
    }
}
