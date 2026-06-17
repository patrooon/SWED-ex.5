public class identicalContentSizeStrategy implements WebsiteComparisonStrategy{
    @Override
    public boolean checkForChanges(String lastData, String newData) {
        return lastData.length()!=newData.length();
    }
}
