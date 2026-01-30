package com.example.demo.controller;

import com.example.demo.model.Item;
import com.example.demo.repository.ItemRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DataController {

    private final ItemRepository repository;

    public DataController(ItemRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/data")
    public List<Item> getData() {
        return repository.findAll();
    }
}

