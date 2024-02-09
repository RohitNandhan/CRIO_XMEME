package com.crio.starter.exchange;


import com.crio.starter.dto.MemeDto;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
public class MemeListResponseDto {
  
  private List<MemeDto> memes;
}
