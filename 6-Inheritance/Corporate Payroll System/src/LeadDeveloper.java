public class LeadDeveloper extends Developer{
    private final int teamBonus = 500;

    public LeadDeveloper(int id, String name, double baseSalary,int overtimeHours){
        super(id, name, baseSalary,overtimeHours);
    }
    @Override
    public double calculateSalary(){
        return super.calculateSalary() + teamBonus;
    }
    public void printEmployeeDetails() {
        System.out.println("Lead Developer ID: " + getId() + ", Name: " + this.name);
    }
}
