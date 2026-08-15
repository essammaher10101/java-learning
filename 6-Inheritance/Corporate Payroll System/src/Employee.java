public class Employee {
    private int id;
    protected String name;
    protected double baseSalary;

    public Employee(int id, String name, double baseSalary){
        this.id = id;
        this.name = name;
        this.baseSalary =baseSalary;
    }
    public double calculateSalary(){
        return this.baseSalary;
    }
    public int getId() {
        return this.id;
    }
}
