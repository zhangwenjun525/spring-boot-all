通过springboot加载外部配置文件
(1)实现EnvironmentPostPocessor接口
(2)由于这个接口是springboot的接口，需要在spring.factories文件中注册(在类路径下建立spring.factories文件，文件位于/META-INF文件夹下)
(3)在spring.factories中对实现类进行注册