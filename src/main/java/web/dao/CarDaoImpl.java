package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW",     "Blue",  150));
        cars.add(new Car("Ferrari", "Red",   250));
        cars.add(new Car("Lada",    "White", 350));
        cars.add(new Car("Huinday", "Grey",  450));
        cars.add(new Car("Ford",    "Black", 550));
    }

    @Override
    public List<Car> getCars(int size) {
        return size > 5 ? cars.subList(0,5) : cars.subList(0, size);
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }
}
