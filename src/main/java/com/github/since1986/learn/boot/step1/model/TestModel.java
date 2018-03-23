package com.github.since1986.learn.boot.step1.model;

import java.io.Serializable;

public class TestModel implements Serializable {

    private long id;
    private String name;

    public TestModel() {
    }

    private TestModel(Builder builder) {
        setId(builder.id);
        setName(builder.name);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static final class Builder {
        private long id;
        private String name;

        private Builder() {
        }

        public Builder withId(long id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public TestModel build() {
            return new TestModel(this);
        }
    }
}
