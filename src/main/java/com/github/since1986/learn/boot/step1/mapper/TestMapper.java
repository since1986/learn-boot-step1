package com.github.since1986.learn.boot.step1.mapper;

import com.github.since1986.learn.boot.step1.model.TestModel;
import org.apache.ibatis.annotations.Param;

public interface TestMapper {

    void save(@Param("test") TestModel test);

    TestModel get(long id);

    void update(@Param("name") String name, @Param("id") long id);

    void delete(long id);
}
