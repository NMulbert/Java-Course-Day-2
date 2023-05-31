package package4;

import package4.Interfaces.ElectricityConsumer;

public class Computer implements ElectricityConsumer {
    @Override
    public void turnOn() {
        System.out.println("The Computer Turned On.");
    }
}
