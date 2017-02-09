package com.zhangwj.project.springboot.optimize;

import org.apache.catalina.connector.Connector;
import org.apache.coyote.ProtocolHandler;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.stereotype.Component;

/**
 * 定制嵌入式servlet容器
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/9
 * Time: 10:42
 */
@Component
public class MyEmbeddedServletContainerCustomizer implements EmbeddedServletContainerCustomizer {

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        TomcatEmbeddedServletContainerFactory factory = (TomcatEmbeddedServletContainerFactory) container;
        factory.setPort(8089);
        factory.addConnectorCustomizers(new MyTomcatConnectorCustomizer());
    }
}

class MyTomcatConnectorCustomizer implements TomcatConnectorCustomizer{

    @Override
    public void customize(Connector connector) {
        ProtocolHandler protocolHandler = connector.getProtocolHandler();
        Http11NioProtocol protocol = (Http11NioProtocol) protocolHandler;
        protocol.setMaxConnections(2000);   //设置最大连接数
        protocol.setMaxThreads(500);  //设置最大线程数
    }
}
