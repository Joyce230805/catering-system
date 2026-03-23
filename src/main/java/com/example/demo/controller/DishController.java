package com.example.demo.controller;

import com.example.demo.model.Dish;
import com.example.demo.repository.DishRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dishes")
@CrossOrigin
public class DishController {

    private final DishRepository dishRepository;

    public DishController(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    // 👉 今日菜單（給客人）
    @GetMapping("/today")
    public List<Dish> getTodayMenu() {
        return dishRepository.findByAvailableTodayTrue();
    }

    // 👉 全部菜（給 admin）
    @GetMapping("/all")
    public List<Dish> getAllDishes() {
        return dishRepository.findAll();
    }

    // 👉 切換開關（最重要🔥）
    @PutMapping("/{id}/toggle")
    public Dish toggleDish(@PathVariable Long id) {
        Dish dish = dishRepository.findById(id).orElseThrow();

        dish.setAvailableToday(!dish.getAvailableToday());

        return dishRepository.save(dish);
    }
}