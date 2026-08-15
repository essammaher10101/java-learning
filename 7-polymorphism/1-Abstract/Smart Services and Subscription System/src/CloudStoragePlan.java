public class CloudStoragePlan extends Subscription implements OfflineDownloadable {


    public CloudStoragePlan(String planName, double baseMonthlyPrice) {
        super(planName, baseMonthlyPrice);
    }

    @Override
    public void downloadOffline() {

    }

    @Override
    public double calculateFinalPrice() {
        return baseMonthlyPrice + 20;
    }
}
