import javax.xml.crypto.Data;

public class Car {
    int CurrentSpeed = 0;
    String color;
    String model;
    int year;
    Data dateOfManufacture;

    //This To pass the current object as a parameter to another method
    Car getCarDetails(){
        return this;
    }

    Car(){

    }
    //This To refer to instance variables when they are shadowed by method parameters(same name)
    Car (String color){
        this.color = color;
    }
    //Overloaded constructor
    //increasing the number of parameters
    //Using this() to call another constructor in the same class
    Car(String model, int year, String color){
        this(color);
        this.model = model;
        this.year = year;
    }
    //Overloaded constructor
    //Changing the order of parameters
    Car(int year, String model){
        this.year = year;
        this.model = model;
    }
    void increaseSpeed(){
        CurrentSpeed += 50;
    }
    void applyBrakes(){
        CurrentSpeed -= 50;
    }
}
