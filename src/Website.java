public class Website implements Subject{
    Website(String URL){
        this.URL=URL;
    }
    Website(String URL,WebsiteComparisonStrategy strategy){
        this.URL=URL;
        this.strategy=strategy;
    }
    private final String URL;
    private WebsiteComparisonStrategy strategy;
    private String previousHtmlData;
    private  String retrieveCurrentHtml(){
        return "";
    }
    private void checkForUpdate() {//periodically called
        if (strategy==null)return;//ensure we implemented a strategy
        String currentHTML = retrieveCurrentHtml();
        if (strategy.checkForChanges(previousHtmlData,currentHTML)) {
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
