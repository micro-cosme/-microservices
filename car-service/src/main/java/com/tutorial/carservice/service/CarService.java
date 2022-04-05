package com.tutorial.carservice.service;

import com.tutorial.carservice.entity.Car;
import com.tutorial.carservice.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;
    //toda la lista de Car
    public List<Car> getAll() {
        return carRepository.findAll();
    }
    //Obtener Car por Id
    public Car getCarById(int id) {
        return carRepository.findById(id).orElse(null);
    }
    //Guardar Car
    public Car save(Car car) {
        Car carNew = carRepository.save(car);
        return carNew;
    }
    //Lista de Car por Id de usuario
    public List<Car> byUserId(int userId) {
        return carRepository.findByUserId(userId);
    }
}
