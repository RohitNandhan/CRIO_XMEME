package com.crio.starter.controller;

import com.crio.starter.App;
import com.crio.starter.service.MemeService;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
// import com.crio.starter.App;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.util.UriComponentsBuilder;



@SpringBootTest(classes = {App.class})
@MockitoSettings(strictness = Strictness.STRICT_STUBS)
// @Auto
public class MemeControllerTest {

  private static final String Meme_API = "/meme";

  private ObjectMapper objectMapper;

  private MockMvc mvc;

  @MockBean
  private MemeService memeService;

  @InjectMocks
  private  MemeController memeController;

  @BeforeEach
  public void setUp() throws Exception {
    objectMapper = new ObjectMapper();

    MockitoAnnotations.openMocks(this);
    // this.mvc = MockMvcBuilder.standaloneSetup(memeController).build();
  }

  // @Test


}
    

