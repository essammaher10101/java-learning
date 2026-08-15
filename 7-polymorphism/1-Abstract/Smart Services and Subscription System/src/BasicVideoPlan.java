public class BasicVideoPlan extends Subscription implements Streamable{

    public BasicVideoPlan(String planName, double baseMonthlyPrice) {
        super(planName, baseMonthlyPrice);
    }

    //abstract methode
    public double calculateFinalPrice(){

        return baseMonthlyPrice * 1.14;
    }
    public void streamContent(){

    }

}
