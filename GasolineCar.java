public class GasolineCar extends AFuelCar {

    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLiter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLiter);
    }

    @Override
    public String getFuelType() {
        return "Gasoline";
    }

    @Override
    public int getRegistrationFee() {
        int kmPrLiter = kmPrLiter();

        if (kmPrLiter > 20 && kmPrLiter <= 50) {
            return 330;
        } else if (kmPrLiter > 15 && kmPrLiter <= 20) {
            return 1050;
        } else if (kmPrLiter > 10 && kmPrLiter <= 15) {
            return 2340;
        } else if (kmPrLiter > 5 && kmPrLiter <= 10) {
            return 5500;
        } else if (kmPrLiter <= 5) {
            return 10470;
        } else {
            throw new IllegalStateException("Ugyldig kmPrLiter værdi: " + kmPrLiter);
        }
    }

    @Override
    public String toString() {
        return "Benzin Bil" + super.toString() + "";
    }

}
