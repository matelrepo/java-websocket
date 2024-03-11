package com.himanshu.websocketclientserver.server;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ServerController {
 
    @MessageMapping("/process-message")
    @SendTo("/topic/messages")
    public Candle processMessage(String incomingMessage) throws Exception{
        System.out.println("Receiving message ... " + incomingMessage);
        Thread.sleep(1000);
        return new Candle(1,incomingMessage);
    }
}
