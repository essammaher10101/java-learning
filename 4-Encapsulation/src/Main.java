//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        //Encapsulation: Setting private fields through setters
        person.setName("Alice");
        person.setAge(30);
        //Encapsulation:cant Access private fields through object directly, must use getters and setters
        //System.out.println(person.name);
        //System.out.println(person.age);


        //Encapsulation: Accessing private fields through getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());


    }
}