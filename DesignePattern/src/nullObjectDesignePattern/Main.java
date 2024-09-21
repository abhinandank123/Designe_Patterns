package nullObjectDesignePattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle=VehicleFactory.getVehicleObject("Car");
		printVehicleDetail(vehicle);

	}
	private static void printVehicleDetail(Vehicle vehicle) {
		System.out.println("Seating Capacity "+vehicle.getSeatingCapacity());
		System.out.println("Tank Capacity "+vehicle.getTankCapacity());
	}

}
