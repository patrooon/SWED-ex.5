public class identicalTextContentStrategy implements  WebsiteComparisonStrategy{
    @Override
    public boolean checkForChanges(String lastData, String newData) {
        return !lastData.equals(newData);
    }
}
