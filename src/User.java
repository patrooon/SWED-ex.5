public class User implements Observer{
    User(String URL, Frequencies frequency, CommunicationChannels channel){
        registeredWebsite=new Website(URL);
        this.frequency=frequency;
        this.channel=channel;
    }
    private String localWebsiteState;
    public Website getRegisteredWebsite(){
        return registeredWebsite;
    }
    public CommunicationChannels getChannel(){
        return channel;
    }
    public void receiveNotification(Notification notification){}
    private Website registeredWebsite;
    private Frequencies frequency;
    private CommunicationChannels channel;

    @Override
    public void update(Notification notification) {
        localWebsiteState=notification.newHtml;
    }
}
