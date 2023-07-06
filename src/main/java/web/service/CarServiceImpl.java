package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> list = new ArrayList<>();

    {
        list.add(new Car("BMW", "black", 2020));
        list.add(new Car("Mercedes", "white", 2019));
        list.add(new Car("Audi", "red", 2022));
        list.add(new Car("Dodge", "yellow", 2010));
        list.add(new Car("Ford", "silver", 1967));
    }

    @Override
    public List<Car> listCars(Integer i) {
        return list.stream().limit(i).collect(Collectors.toList());
    }
}
