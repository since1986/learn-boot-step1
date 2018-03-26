# learn-boot-step1
---

这是我的文章[「Spring Cloud与微服务学习笔记-关于Spring Boot」](https://since1986.github.io/blog/2018/03/26/Spring-Cloud%E4%B8%8E%E5%BE%AE%E6%9C%8D%E5%8A%A1%E5%AD%A6%E4%B9%A0%E7%AC%94%E8%AE%B0-%E5%85%B3%E4%BA%8ESpring-Boot/)对应的工程代码。

代码结构：
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
