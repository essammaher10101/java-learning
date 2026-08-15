public class Mage extends Hero{

    Mage(String name){
        super(name);
    }
    @Override
    public void performAction(){
        System.out.println(name + "casts a fireball spell!");
    }
    public void restoreMana(){
        System.out.println(name + " recharging magic energy");
    }
}
