# spring_cloud
架构设计概念,各服务间隔离（分布式也是隔离）,自治（分布式依赖整体组合）其它特性(单一职责,边界,异步通信,独立部署)是分布式概念的跟严格执行
SpringCloud 为开发人员提供了快速构建分布式系统的一些工具，包括配置管理、服务发现、断路器、路由、微代理、事件总线、全局锁、决策竞选、分布式会话等等。
其中用到了Eurake、Ribbon、Feign、Hystrix、Zuul、Config技术。
它运行环境简单，可以在开发人员的电脑上跑。

本次案例用的工具版本如下
eclipse : 2018-12 (4.10.0)
JDK : 1.8
SpringCloud : Finchley.RELEASE
SpringBoot : 2.0.3
