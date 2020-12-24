package com.core.associations.web;

import com.core.associations.domain.InputMessage;
import com.core.associations.domain.OutputMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

  @MessageMapping("/test")
  @SendTo("/topic/messages")
  public OutputMessage sendMessage(@Payload InputMessage message) {
    return new OutputMessage("New message " + message.getMessage());
  }
}
