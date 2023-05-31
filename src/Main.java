import Package3.Car;
import Package3.Vehicle;

public class Main {
    public static void main(String[] args) {
        //public - can be accessed from anywhere without restrictions.
        //protected - accessible within the same package and subclass (class1 extends class2).
        //private - can only be accessed from the class from which they are declared.

        //***Theoretical Questions Answers***
        //1.C
        //2.B
        //3.C
        //4.A
        //5.B
        //6.C
        //7.B
        //8.A
        //9.B
        //10.B

        Vehicle myVehicle = new Vehicle();
        Car myCar = new Car();

        myVehicle.GetDetails();
        myCar.GetDetails();

        myCar.IncreaseACPower();
        myCar.GetDetails();

    }
}