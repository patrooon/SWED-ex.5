public class identicalHtmlContentStrategy implements WebsiteComparisonStrategy{
    @Override
    public boolean checkForChanges(String lastData, String newData) {
        return false;
    }
}
