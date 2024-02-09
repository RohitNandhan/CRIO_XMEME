package com.crio.starter.repository;

import com.crio.starter.data.MemeEntity;
import com.crio.starter.dto.MemeDto;
import com.crio.starter.exchange.MemeListResponseDto;
import com.crio.starter.exchange.MemeRequest;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import javax.inject.Provider;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;



@Service
public class MemeRepositoryService implements IMemeRepositoryService {

  @Autowired
  private  IMemeRepository memeRepository;

  @Autowired
  private MongoTemplate mongoTemplate;

  @Autowired
  private Provider<ModelMapper> modelMapperList;

  @Autowired
  private ModelMapper modelMapper;

  public List<MemeDto> findAllMemes() {

    List<MemeEntity> memes = memeRepository.findAll();


    return memes.stream().map(m -> modelMapperList.get().map(m, MemeDto.class))
    .collect(Collectors.toList());
  }

  @Override
  public MemeDto findMemeByName(String name) {

    MemeEntity meme = memeRepository.findByName(name);

    if (meme != null) {
      return modelMapper.map(meme, MemeDto.class);
    } else {

      throw new IllegalArgumentException("No such meme!");
    }

  }

  @Override
  public boolean saveNewMeme(MemeRequest memeRequest) {
    MemeEntity memeEntity = modelMapper.map(memeRequest, MemeEntity.class);
    try {
      MemeEntity saveMeme = memeRepository.save(memeEntity);
      if (saveMeme != null) {
        return true;
      } else {
        return false;
      }
      
    } catch (DataAccessException ex) {
      
      System.out.println("Error saving meme to database");
      return false;
    }
  }
}
