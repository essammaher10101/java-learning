public class Person {
    // Encapsulation: Private fields with public getters and setters
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    //Encapsulation: Validation in setter to ensure name is not null or empty
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
}
