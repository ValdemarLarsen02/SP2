public class ElectricCar extends ACar {
    private final int batteryCapacityKWh;
    private final int maxRangeKm;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacityKWh,
            int maxRangeKm) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxRangeKm = maxRangeKm;
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacityKWh;
    }

    public int getMaxRangeKm() {
        return maxRangeKm;
    }

    // Denne metode beregner watt-timer per kilometer baseret på batterikapaciteten
    // og den maksimale rækkevidde.
    public int getWhPrKm() {
        if (maxRangeKm == 0) {
            throw new IllegalArgumentException("Maksimal rækkevidde må ikke være 0");
        }
        return (int) ((double) batteryCapacityKWh * 1000 / maxRangeKm);
    }

    @Override
    public int getRegistrationFee() {
        int whPrKm = getWhPrKm();
        // Laver Omregning fra Wh/km til km/l for elbiler
        double kmPrLiterEquiv = 100 / (whPrKm / 91.25);
        // Sammme afgift some på en benzin bil med den afregnet værdi til km/l.
        if (kmPrLiterEquiv > 20 && kmPrLiterEquiv <= 50) {
            return 330;
        } else if (kmPrLiterEquiv > 15 && kmPrLiterEquiv <= 20) {
            return 1050;
        } else if (kmPrLiterEquiv > 10 && kmPrLiterEquiv <= 15) {
            return 2340;
        } else if (kmPrLiterEquiv > 5 && kmPrLiterEquiv <= 10) {
            return 5500;
        } else if (kmPrLiterEquiv <= 5) {
            return 10470;
        } else {
            throw new IllegalStateException("Ugyldig Wh pr km værdi: " + whPrKm);
        }
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "registrationNumber='" + getRegistrationNumber() + '\'' +
                ", Mærke='" + getMake() + '\'' +
                ", Model='" + getModel() + '\'' +
                ", Antal Døre=" + getNumberOfDoors() +
                ", Batteri Kapacitet=" + getBatteryCapacityKWh() +
                ", Max Rækkevide=" + getMaxRangeKm() +
                ", WhPrKm=" + getWhPrKm() +
                '}';
    }

}
