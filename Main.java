//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape[]  shapes= new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Square();

        for (Shape shape : shapes) {
            shape.draw();
        }

    }
}