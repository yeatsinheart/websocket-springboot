package com.example.websocket;
/**
 * @description:
 * @author: Yeats [yeats@xiaomingsport.com]
 * @create: 2019-02-01 18:03
 **/
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

@Configuration
public class WebSocketConfig {
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}