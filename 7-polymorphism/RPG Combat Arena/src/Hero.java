public class Hero {
    protected String name;

    public Hero (String name){
        this.name = name;
    }
    public void performAction(){
        System.out.println(name + "prepares for battle.");
    }
}
