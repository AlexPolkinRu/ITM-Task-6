package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private static final List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car(1, "KIA Ceed", "black"));
        cars.add(new Car(2, "Hyundai Creta", "grey"));
        cars.add(new Car(3, "Lada Kalina", "white"));
        cars.add(new Car(4, "BMW X6", "red"));
        cars.add(new Car(5, "Porsche Cayenne", "silver"));
    }

    public List<Car> getCars(int count) {
        List<Car> result = new ArrayList<>();

        if (count < 1 || count > 5) {
            count = 5;
        }

        Car car;
        for (int i = 0; i < count; i++) {
            car = cars.get(i);
            result.add(car);
        }
        return result;
    }
}
