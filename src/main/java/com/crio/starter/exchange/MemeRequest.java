package com.crio.starter.exchange;


import com.crio.starter.dto.MemeDto;
import com.mongodb.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
public class MemeRequest {
  
  @NonNull
  private String name;
  @NonNull
  private String url;
  @NonNull
  private String caption;
 
}
