public class DieselCar extends AFuelCar {
    private boolean hasParticleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLiter,
            boolean hasParticleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLiter);
        this.hasParticleFilter = hasParticleFilter;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {
        int kmPrLiter = kmPrLiter();
        int baseFee = 0;
        int additionalFee = 0;

        // Beregn grundafgiften baseret på kmPrLiter
        if (kmPrLiter > 20 && kmPrLiter <= 50) {
            baseFee = 330;
            additionalFee = 130;
        } else if (kmPrLiter > 15 && kmPrLiter <= 20) {
            baseFee = 1050;
            additionalFee = 1390;
        } else if (kmPrLiter > 10 && kmPrLiter <= 15) {
            baseFee = 2340;
            additionalFee = 1850;
        } else if (kmPrLiter > 5 && kmPrLiter <= 10) {
            baseFee = 5500;
            additionalFee = 2770;
        } else if (kmPrLiter <= 5) {
            baseFee = 10470;
            additionalFee = 15260;
        } else {
            throw new IllegalStateException("Ugyldig kmPrLiter værdi: " + kmPrLiter);
        }

        // Hvis false lægger vi ekstra beløb på.
        if (!hasParticleFilter) {
            additionalFee += 1000;
        }

        return baseFee + additionalFee;
    }

    public boolean hasParticleFilter() {
        return hasParticleFilter;
    }

    @Override
    public String toString() {
        return "Diesel bil: " + super.toString() + ", Har Partikelfilter: " + hasParticleFilter() + "";
    }

}
