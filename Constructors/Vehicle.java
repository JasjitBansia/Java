/*
 * Define a class 'Vehicle' having instance variables as numOfPassengers, fuelCapacity, fuelConumed per kilomete
 * Define a parameterised constructor to initiate their default values
 * Create two objects TwoWheeler and FourWheeler of this class and display their details
 */

class Vehicle {
    int numOfPassengers;
    int fuelCapacity;
    double fuelConsumedPKm;

    Vehicle(int nop, int fc, double fcpkm) {
        numOfPassengers = nop;
        fuelCapacity = fc;
        fuelConsumedPKm = fcpkm;
    }

    public static void main(String[] args) {
        Vehicle TwoWheeler = new Vehicle(2, 5, (1 / 60.0));
        System.out.println("----------TWO WHEELER----------");
        System.out.println("Number of passengers: " + TwoWheeler.numOfPassengers);
        System.out.println("Fuel capacity: " + TwoWheeler.fuelCapacity + " litres");
        System.out.println("Fuel consumed per kilometer: " + TwoWheeler.fuelConsumedPKm + " litre");
        Vehicle FourWheeler = new Vehicle(5, 42, (1 / 18.0));
        System.out.println();
        System.out.println("----------FOUR WHEELER----------");
        System.out.println("Number of passengers: " + FourWheeler.numOfPassengers);
        System.out.println("Fuel capacity: " + FourWheeler.fuelCapacity + " litres");
        System.out.println("Fuel consumed per kilometer: " + FourWheeler.fuelConsumedPKm + " litre");
    }
}
