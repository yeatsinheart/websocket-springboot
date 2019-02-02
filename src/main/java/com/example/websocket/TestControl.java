package com.example.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Yeats [yeats@xiaomingsport.com]
 * @create: 2019-02-01 18:20
 **/
@RestController
public class TestControl {
    @Autowired
    WebSocketServer webSocketServer;
    @RequestMapping("/test")
    public void k(String msg){
        webSocketServer.sendMsgByServer(msg);
    }
}
