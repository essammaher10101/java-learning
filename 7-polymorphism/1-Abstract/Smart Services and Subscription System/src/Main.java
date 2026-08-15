//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Subscription & Logistics System ===");

        Subscription[] subscriptions = new Subscription[3];

        subscriptions[0] = new BasicVideoPlan("Basic", 350);
        subscriptions[1] = new PremiumVideoPlan("Premium", 100);
        subscriptions[2] = new CloudStoragePlan("Cloud", 10000);

        for (Subscription subscription: subscriptions){

            for (Subscription sub : subscriptions) {
                System.out.println("----------------------------------------");
                sub.printInvoice();
                System.out.println("Final Price (with taxes): $" + sub.calculateFinalPrice());

                if (sub instanceof Streamable) {
                    Streamable streamer = (Streamable) sub; // Downcasting
                    streamer.streamContent();
                }

                if (sub instanceof OfflineDownloadable) {
                    OfflineDownloadable downloader = (OfflineDownloadable) sub; // Downcasting
                    downloader.downloadOffline();
                }
        }
    }
}