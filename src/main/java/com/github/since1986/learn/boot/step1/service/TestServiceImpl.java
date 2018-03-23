package com.github.since1986.learn.boot.step1.service;

import com.github.since1986.learn.boot.step1.mapper.TestMapper;
import com.github.since1986.learn.boot.step1.model.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class TestServiceImpl implements TestService {

    private final TestMapper testMapper;

    @Autowired
    public TestServiceImpl(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    @Override
    public void save(String name) {
        testMapper.save(
                TestModel
                        .newBuilder()
                        .withId(System.nanoTime())
                        .withName(name)
                        .build()
        );
    }

    @Override
    public TestModel get(long id) {
        return testMapper.get(id);
    }

    @Override
    public void update(String name, long id) {
        testMapper.update(name, id);
    }

    @Override
    public void delete(long id) {
        testMapper.delete(id);
    }
}
