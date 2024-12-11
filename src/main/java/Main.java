import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Введите название автомобиля #" + i + ": ");
            String name = scanner.next();

            int speed;
            while (true) {
                System.out.print("Введите скорость автомобиля #" + i + ": ");

                try {
                    speed = scanner.nextInt();

                    if (speed > 0 && speed <= 250) {
                        break;
                    } else {
                        System.out.println("Некорректное значение скорости: " + speed + ". Допустимый диапазон от 1 до 250");
                    }

                } catch (Exception e) {
                    scanner.next();
                }

            }

            carList.add(
                    new Car(
                            name,
                            speed
                    )
            );

        }

        Race race = new Race();
        race.start(carList);

        System.out.println("Самая быстрая машина: " + race.getWinnerCar().getName());
    }
}