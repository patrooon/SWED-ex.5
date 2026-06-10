
public class Notification{
    Notification(String newHtml, Observer observer){
        this.newHtml=newHtml;
    }
    public String newHtml;
    CommunicationChannels channel;
    User user;
}
