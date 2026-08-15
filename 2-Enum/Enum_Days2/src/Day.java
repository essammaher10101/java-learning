//It’s a special type of class that is more powerful than a set of public static final
//constants because it is type-safe and can have fields, methods, and constructors.
public enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}