public class PremiumVideoPlan extends Subscription implements Streamable, OfflineDownloadable{

    public PremiumVideoPlan(String planName, double baseMonthlyPrice) {
        super(planName, baseMonthlyPrice);
    }

    @Override
    public void downloadOffline() {

    }

    @Override
    public void streamContent() {

    }

    @Override
    public double calculateFinalPrice() {
        return (baseMonthlyPrice * 1.14) + 50;
    }
}
