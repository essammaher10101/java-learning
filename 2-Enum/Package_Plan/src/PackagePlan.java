public enum PackagePlan {
    Basic(100, 140){
        @Override
        public double Tax(double price) {
            return price * 0.1; // 10% tax for Basic plan
        }
    },
    Standard(200, 250){
        @Override
        public double Tax(double price) {
            return price * 0.15; // 15% tax for Standard plan
        }
    },
    Premium(300, 400){
        @Override
        public double Tax(double price) {
            return price * 0.2; // 20% tax for Premium plan
        }
    },
    Ultra(500, 1000){
        @Override
        public double Tax(double price) {
            return price * 0.25; // 25% tax for Ultra plan
        }
    };


    private final int price;
    private final int quota;

    PackagePlan(int price, int quota) {
        this.price = price;
        this.quota = quota;
    }

    public int getPrice() {
        return price;
    }

    public int getQuota() {
        return quota;
    }
    public abstract double Tax(double price);
}
