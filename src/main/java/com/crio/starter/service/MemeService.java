package com.crio.starter.service;

import com.crio.starter.dto.MemeDto;
import com.crio.starter.exchange.MemeListResponseDto;
import com.crio.starter.exchange.MemeRequest;
import com.crio.starter.repository.IMemeRepositoryService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class MemeService implements IMemeService {

  @Autowired
  private IMemeRepositoryService memeRepositoryService;
  
  @Override
  public MemeListResponseDto findAllMemes() {

    List<MemeDto> memeList = memeRepositoryService.findAllMemes();
     
    return new MemeListResponseDto(memeList);
  }

  @Override
  public boolean saveMeme(MemeRequest meme) {

    return memeRepositoryService.saveNewMeme(meme);

  }

  @Override
  public MemeDto findByName(String name) {


    return memeRepositoryService.findMemeByName(name);
  }

}
