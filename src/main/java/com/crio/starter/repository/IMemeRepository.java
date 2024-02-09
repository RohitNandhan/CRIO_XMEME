package com.crio.starter.repository;

import com.crio.starter.data.MemeEntity;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMemeRepository extends MongoRepository<MemeEntity,String> {

  public MemeEntity findByName(String name);
 
  public List<MemeEntity> findAll();

  public MemeEntity save(MemeEntity meme);

}
