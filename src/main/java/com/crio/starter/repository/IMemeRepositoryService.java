package com.crio.starter.repository;


import com.crio.starter.data.MemeEntity;
import com.crio.starter.dto.MemeDto;
import com.crio.starter.exchange.MemeListResponseDto;
import com.crio.starter.exchange.MemeRequest;
import java.util.List;

public interface IMemeRepositoryService { 

  List<MemeDto> findAllMemes();

  MemeDto findMemeByName(String name);

  boolean saveNewMeme(MemeRequest memeRequest);
  
}
