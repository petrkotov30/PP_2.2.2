package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private final CarServiceImpl carService;
    private final List<Car> list = new ArrayList<>();

    {
        list.add(new Car("BMW", "black", 2020));
        list.add(new Car("Mercedes", "white", 2019));
        list.add(new Car("Audi", "red", 2022));
        list.add(new Car("Dodge", "yellow", 2010));
        list.add(new Car("Ford", "silver", 1967));
    }

    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String listCar(@RequestParam(value = "count", defaultValue = "5") Integer count, Model model) {
        model.addAttribute("cars", carService.listCars(list, count));
        return "cars";
    }
}
