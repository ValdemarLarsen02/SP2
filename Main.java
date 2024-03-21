public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();

        // Opretter de forskellige biler
        fleet.addCar(new GasolineCar("ABC123", "Toyota", "Corolla", 4, 18));
        fleet.addCar(new DieselCar("XYZ789", "Volkswagen", "Passat", 4, 15, true));
        fleet.addCar(new ElectricCar("EFG456", "Tesla", "Model S", 4, 85, 400));

        // Udskriv alle biler i flåden
        System.out.println(fleet.toString());

        // Beregn og udskriv den samlede registreringsafgift for flåden
        System.out.println("Total registration fee for the fleet: " + fleet.getTotalRegistrationFeeForFleet() + " kr.");
    }
}
