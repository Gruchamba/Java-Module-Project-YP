import java.util.Iterator;
import java.util.List;

public class Race {

    private final int duration = 24;
    private Car winnerCar;

    public Car getWinnerCar() {
        return winnerCar;
    }

    public void start(List<Car> carList) {

        Iterator<Car> iterator = carList.iterator();
        winnerCar = iterator.next();

        while (iterator.hasNext()) {
            Car car = iterator.next();

            if (winnerCar.getSpeed() * duration < car.getSpeed() * duration) {
                winnerCar = car;
            }
        }

    }
}
