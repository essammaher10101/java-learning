//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Combat Arena ===");

        Hero[] team = new Hero[3];

        team[0] = new Warrior("Esam");
        team[1] = new Mage("Arthur");
        team[2] = new Warrior("Moaz");

        for (Hero hero : team){

            hero.performAction();

            if (hero instanceof Mage){
                Mage myMage = (Mage) hero;

                myMage.restoreMana();
            }
            System.out.println("--------------------------------");
        }

    }
}