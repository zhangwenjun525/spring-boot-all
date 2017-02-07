测试BeanPostProcessor接口的使用

BeanPostProcessor接口作用是：如果我们需要在Spring容器完成Bean的实例化、配置和其他的初始化前后添加一些自己的逻辑处理，我们就可以定义一个或者多个BeanPostProcessor接口的实现，然后注册到容器中。

结果:
  这是BeanPostProcessor实现类构造器！！
  bean处理器：bean创建之前..
  bean init...
  bean处理器：bean创建之后..