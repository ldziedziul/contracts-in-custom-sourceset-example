package pl.dziedziul.contractsincustomsourceset;

import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class CarResource {

    @GetMapping("/cars")
    List<Car> getAllCars() {
        return List.of(new Car("Ford", "Mondeo"), new Car("Kia", "Optima"));
    }

    @Value
    static class Car {
        String brand;
        String model;
    }
}
