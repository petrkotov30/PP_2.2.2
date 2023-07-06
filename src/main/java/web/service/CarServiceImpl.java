package web.service;

import org.springframework.stereotype.Service;
import web.CarDao.CarDao;
import web.models.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }


    @Override
    public List<Car> listCars(Integer i) {
        return carDao.getCars().stream().limit(i).collect(Collectors.toList());
    }
}
