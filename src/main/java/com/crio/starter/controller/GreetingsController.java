package com.crio.starter.controller;

import com.crio.starter.data.GreetingsEntity;
import com.crio.starter.exchange.ResponseDto;
import com.crio.starter.service.GreetingsService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Log4j2
public class GreetingsController {

  private final GreetingsService greetingsService;

  // Logger log=LoggerFactory.getLogger(GreetingsController.class);
  // Logger log=LoggerFactory.getLogger(GreetingsController.class);

  @GetMapping("/say-hello")
  public ResponseDto sayHello(@RequestParam String messageId) {
    
    log.info("Received request for messageId: {}", messageId);

    // List<GreetingsEntity> grr= greetingsService.
    
    return greetingsService.getMessage(messageId);
    // return null;



  }

}
