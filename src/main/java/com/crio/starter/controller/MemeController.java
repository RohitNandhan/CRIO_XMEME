package com.crio.starter.controller;

import com.crio.starter.dto.MemeDto;
import com.crio.starter.exchange.MemeListResponseDto;
import com.crio.starter.exchange.MemeRequest;
import com.crio.starter.exchange.ResponseDto;
import com.crio.starter.service.GreetingsService;
import com.crio.starter.service.IMemeService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
// @Log4j(GreetingsController.class)
public class MemeController {

  private final IMemeService memeService;

  // Logger log=LoggerFactory.getLogger(GreetingsController.class);
  // Logger log=LoggerFactory.getLogger(GreetingsController.class);

  @GetMapping("/meme")
  public MemeListResponseDto getAllMemes() {
    log.info("Request received");

    final MemeListResponseDto response = memeService.findAllMemes();

    log.error("No Meme Found");
    log.info("Fetching the meme list.......");
    log.info("fuck u......."); // (Make sure to provide a meaningful log message)

    return response;

  }

  @PostMapping("/meme")
  public ResponseEntity<String> addMeme(@RequestBody MemeRequest memeRequest) {

    if (memeService.saveMeme(memeRequest)) {
      return ResponseEntity.status(HttpStatus.CREATED).body("Meme created successfully");
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("failed to create meme");
    }
  }

  @GetMapping("/meme/{name}")
  public  MemeDto getMemeById(@PathVariable String name) {

    log.info("Received request for messageId: {}", name);
    
    // MemeDto dto =;
    return  memeService.findByName(name);
  }
}
