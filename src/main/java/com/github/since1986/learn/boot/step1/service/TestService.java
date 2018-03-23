package com.github.since1986.learn.boot.step1.service;

import com.github.since1986.learn.boot.step1.model.TestModel;

public interface TestService {

    void save(String name);

    TestModel get(long id);

    void update(String name, long id);

    void delete(long id);
}
