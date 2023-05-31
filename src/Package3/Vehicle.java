package Package3;

public class Vehicle extends MeansOfTransport {
        private int FuelOctaneNumber = 98;

    public int getFuelOctaneNumber() {
        return FuelOctaneNumber;
    }

    public void GetDetails() {
        System.out.println("Speed: " + Speed + ", Engine Capacity: " + EngineCapacity + ", Fuel Octane Number" + FuelOctaneNumber);
    }
}
