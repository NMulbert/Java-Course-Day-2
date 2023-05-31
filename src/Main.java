import package3.Car;
import package3.Vehicle;
import package4.Pen;
import package4.WritingTool;
import package5.ValueHolder;
import package6.DayOfWeek;
import package7.Cloths;
import package7.Electronics;
import package7.Product;

import java.util.ArrayList;
import java.util.Scanner;

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

        myVehicle.getDetails();
        myCar.getDetails();

        myCar.increaseACPower();
        myCar.getDetails();

        WritingTool wt = new WritingTool();
        wt.erase();
        Pen pen = new Pen();
        pen.erase();

        ValueHolder<String> stringHolder = new ValueHolder<>();
        stringHolder.setValue("hello");
        stringHolder.getValue();
        stringHolder.setValue("world");
        stringHolder.getValue();

        ValueHolder<Integer> integerHolder = new ValueHolder<>();
        integerHolder.setValue(8);
        integerHolder.getValue();
        integerHolder.setValue(18);
        integerHolder.getValue();

        ValueHolder<Boolean> booleanHolder = new ValueHolder<>();
        booleanHolder.setValue(true);
        booleanHolder.getValue();
        booleanHolder.setValue(false);
        booleanHolder.getValue();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        int inputNumber = scanner.nextInt();
        if (inputNumber < 1 || inputNumber > 7) {
            System.out.println("Invalid Number");
        }
        else {
            DayOfWeek day = DayOfWeek.values()[inputNumber - 1];
            System.out.println("Day of the week is: " + day);
        }

        ArrayList<Product> productList = new ArrayList<>();
        Electronics monitor = new Electronics("PC Monitor",1299,"OLED 32'","GIGABYTE",0);
        Cloths shirt = new Cloths("Shirt",15,"Blue T-Shirt","L","Cotton");
        productList.add(monitor);
        productList.add(shirt);
        for (Product product: productList) {
            System.out.println(product.toString());
        }
    }
}