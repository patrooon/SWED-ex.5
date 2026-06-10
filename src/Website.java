public class Website implements Subject{
    Website(String URL){
        this.URL=URL;
    }
    private final String URL;
    private String previousHtmlData;
    private  String retrieveCurrentHtml(){
        return "";
    }
    private void checkForUpdate() {//periodically called
        String currentHTML = retrieveCurrentHtml();
        if (!currentHTML.equals(previousHtmlData)) {
            previousHtmlData = currentHTML;
            doNotification();
        }
    }
    public String getPreviousHtmlData() {
        return previousHtmlData;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void doNotification() {
        for (Observer observer : observers) {
            observer.update(new Notification(previousHtmlData,observer));
        }
    }
}
