package web.CarDao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDao {
    private final List<Car> list = new ArrayList<>();

    {
        list.add(new Car("BMW", "black", 2020));
        list.add(new Car("Mercedes", "white", 2019));
        list.add(new Car("Audi", "red", 2022));
        list.add(new Car("Dodge", "yellow", 2010));
        list.add(new Car("Ford", "silver", 1967));
    }

    public List<Car> getCars() {
        return list;
    }
}
