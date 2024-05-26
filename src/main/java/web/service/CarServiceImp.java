package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private final List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("Toyota", "black", 2020));
        carList.add(new Car("Ford", "white", 2015));
        carList.add(new Car("Honda", "gray", 2018));
        carList.add(new Car("BMW", "black", 1998));
        carList.add(new Car("Lada", "red", 1995));
    }
    @Override
    public List<Car> getCarsByCount(int count) {
        return carList.subList(0, count);
    }
    @Override
    public List<Car> getAllCars() {
        return carList;
    }

}
