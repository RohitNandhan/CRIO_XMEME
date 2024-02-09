package com.crio.starter.service;


import com.crio.starter.dto.MemeDto;
import com.crio.starter.exchange.MemeListResponseDto;
import com.crio.starter.exchange.MemeRequest;

public interface IMemeService {

  public MemeListResponseDto findAllMemes();

  public MemeDto findByName(String id);

  public boolean saveMeme(MemeRequest meme);
    
    

}
