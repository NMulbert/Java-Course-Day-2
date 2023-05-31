package Package3;

public class Car extends Vehicle{
    protected int ACPower = 0;
    public void IncreaseACPower(){
        ACPower = ACPower+1;
    }

    @Override
    public void GetDetails() {
        System.out.println("Speed: " + Speed + ", Engine Capacity: " + EngineCapacity + ", Fuel Octane Number" + getFuelOctaneNumber() + ", AC Power: " + ACPower + ".");
    }
}
