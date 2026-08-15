//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        enum Days {
            Monday, Tuesday, Wednesday, thursday, Friday, Saturday,Sunday;

            public boolean isWeekend() {
                return this == Saturday || this == Sunday;
            }
        }

        Days today = Days.Saturday;
        if (today.isWeekend()) {
            System.out.println("It's the weekend!");
        } else {
            System.out.println("It's a weekday.");
        }
    }

}
