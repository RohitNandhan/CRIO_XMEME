package com.crio.starter.data;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "meme")
@NoArgsConstructor
public class MemeEntity {

  private String name;

  private String url;
  
  @Field("cation")
  private String caption;

}
