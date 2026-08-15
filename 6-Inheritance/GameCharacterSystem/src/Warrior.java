public class Warrior extends  Character{
    private double shieldPower;

    Warrior(String name, double shieldPower){
        super(name);
        this.shieldPower = shieldPower;
    }

    @Override
    public void attack(){
        super.attack();
        System.out.println(this.name +" strikes with the sword with devastating force!");
    }
    // public void Testing(){
    //     System.out.println(health);
    // }

    public void printHealth(){
        System.out.println(getHealth());
    }

}
