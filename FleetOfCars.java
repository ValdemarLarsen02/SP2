import java.util.ArrayList;
import java.util.List;

public class FleetOfCars {
    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Alle Biler{\n");
        for (Car car : cars) {
            sb.append(car.toString()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    public int getTotalRegistrationFeeForFleet() {
        int totalFee = 0;
        for (Car car : cars) {
            totalFee += car.getRegistrationFee();
        }
        return totalFee;
    }
}
