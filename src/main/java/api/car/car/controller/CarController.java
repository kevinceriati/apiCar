package api.car.car.controller;

import java.util.*;

import com.google.common.collect.Lists;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import api.car.car.model.Car;
import api.car.car.dao.CarRepository;

@RestController
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @RequestMapping(value="/car", method= RequestMethod.GET)
    public List<Car> carList() {
        List<Car> myList = Lists.newArrayList(carRepository.findAll());
        return myList;
    }


    @RequestMapping(value="/car/{id}", method= RequestMethod.GET)
    public Car findById(@PathVariable int id) throws Exception {
        return carRepository.findById(id).orElseThrow(() -> new Exception("Not Found"));
    }

    @RequestMapping(value="/car", method= RequestMethod.POST)
    public Car save(@RequestBody Car car){
        carRepository.save(car);
        return car;
    }

    @RequestMapping(value="/car/{id}", method= RequestMethod.PUT)
    public Car update(@PathVariable int id, @RequestBody Car car) {
        car.setId(id);
        return carRepository.save(car);
    }

    @RequestMapping(value="/car/{id}", method= RequestMethod.DELETE)
    public void delete (@PathVariable int id) {
        carRepository.deleteById(id);
    }
}

