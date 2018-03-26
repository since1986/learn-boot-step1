package com.github.since1986.learn.boot.step1.controller;

import com.github.since1986.learn.boot.step1.model.TestModel;
import com.github.since1986.learn.boot.step1.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RequestMapping("/test")
@RestController
public class TestController {

    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @PostMapping
    public ResponseEntity save(String name) {
        long createdEntityId = testService.save(name);
        return ResponseEntity.created(URI.create(String.format("/test/%d", createdEntityId))).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TestModel> get(@PathVariable long id) {
        TestModel resultEntity = testService.get(id);
        return resultEntity == null ? ResponseEntity.noContent().build() : ResponseEntity.ok(resultEntity);
    }

    @PutMapping //由于TestModel只有一个可更新属性，所以全量更新与部分更新是等效的，因此在这里使用了全量更新的PUT方法；关于PUT和PATCH https://segmentfault.com/q/1010000005685904
    public ResponseEntity update(@RequestParam("name") String name, @RequestParam("id") long id) {
        testService.update(name, id);
        return ResponseEntity.noContent().build(); //https://stackoverflow.com/questions/2342579/http-status-code-for-update-and-delete
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable long id) {
        testService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
