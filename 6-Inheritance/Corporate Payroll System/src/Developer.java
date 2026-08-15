public class Developer extends Employee{
    private int overtimeHours;
    private static final double HOURLY_RATE = 20.0;

    public Developer(int id, String name, double baseSalary,int overtimeHours){
        super(id, name, baseSalary);
        this.overtimeHours = overtimeHours;
    }
    @Override
    public double calculateSalary(){
        return super.calculateSalary() + overtimeHours * HOURLY_RATE;
    }
}
