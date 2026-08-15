public class Warrior extends Hero{

    Warrior(String name){
        super(name);
    }

    @Override
    public void performAction(){
        System.out.println(name + "swings a heavy sword!");
    }
}
