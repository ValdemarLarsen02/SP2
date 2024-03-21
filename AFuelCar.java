public abstract class AFuelCar extends ACar {
    private int kmPrLiter; // initialisér den i konstruktøren

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLiter) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLiter = kmPrLiter;
    }

    // Returnerer bilens brændstoftype, som enten er "Gasoline" eller "Diesel".
    public abstract String getFuelType();

    // Return til kmPrLiter.
    public int kmPrLiter() {
        return kmPrLiter;
    }

    @Override
    public String toString() {
        return super.toString() + ", kmPrLiter=" + kmPrLiter();
    }

}
