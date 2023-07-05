package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> listCars(List<Car> list,Integer i) {
        if (i>5){return list;}
        return list.subList(0,i);
    }
}
