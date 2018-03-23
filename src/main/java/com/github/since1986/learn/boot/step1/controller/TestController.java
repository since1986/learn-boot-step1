package com.github.since1986.learn.boot.step1.controller;

import com.github.since1986.learn.boot.step1.model.TestModel;
import com.github.since1986.learn.boot.step1.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/test")
@RestController
public class TestController {

    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @PostMapping
    public void save(String name) {
        testService.save(name);
    }

    @GetMapping("/{id}")
    public TestModel get(@PathVariable long id) {
        return testService.get(id);
    }

    @PutMapping
    public void update(@RequestParam("name") String name, @RequestParam("id") long id) {
        testService.update(name, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        testService.delete(id);
    }
}
