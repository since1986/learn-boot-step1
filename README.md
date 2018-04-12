# learn-boot-step1
---

## 简介
这是我的文章[「Spring Cloud与微服务学习笔记-关于Spring Boot」](https://since1986.github.io/blog/37ba2479.html)对应的工程。

## 结构
```
.
├── java
│   └── com
│       └── github
│           └── since1986
│               └── learn
│                   └── boot
│                       └── step1
│                           ├── App.java Boot主启动类
│                           ├── AppConfig.java 主配置
│                           ├── AppProperties.java 自定义属性配置类
│                           ├── MvcConfig.java Mvc配置
│                           ├── controller 控制器包
│                           │   ├── AppExceptionHandler.java Mvc全局异常处理
│                           │   └── TestController.java
│                           ├── mapper Mapper包
│                           │   ├── MapperConfig.java Mapper配置
│                           │   └── TestMapper.java Mapper接口
│                           ├── model Model包
│                           │   └── TestModel.java
│                           └── service Service包
│                               ├── ServiceConfig.java Service配置
│                               ├── TestService.java
│                               └── TestServiceImpl.java
└── resources
    ├── application.yml Boot主配置文件
    ├── com
    │   └── github
    │       └── since1986
    │           └── learn
    │               └── boot
    │                   └── step1
    │                       └── mapper
    │                           └── TestMapper.xml Mapper接口对应的配置文件
    └── import.sql 数据库初始化文件
```
