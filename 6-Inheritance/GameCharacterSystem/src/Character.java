public class Character {
    protected String name;
    private double health = 100;

    public Character(String name){
        this.name = name;
    }

    public double getHealth(){
        return this.health;
    }
    public void attack(){
        System.out.println("The character performs a normal attack.");
    }
}
