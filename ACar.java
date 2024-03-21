public abstract class ACar implements Car {
    // Bruger final da det ikke ændres efter tildeling
    private final String registrationNumber;
    private final String make;
    private final String model;
    private final int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public abstract int getRegistrationFee(); // Denne metode skal implementeres af subklasser

    @Override
    public String toString() {
        return "Car{" +
                "Nummerpalde ='" + getRegistrationNumber() + '\'' +
                ", Mærke='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", Antal Døre=" + getNumberOfDoors() +
                '}';
    }
}
