package br.com.forum.api.perguntas.domain.dto;

import br.com.forum.api.perguntas.domain.Flag;
import lombok.Data;
import org.modelmapper.ModelMapper;

import java.util.Date;

@Data
public class FlagDTO {

    private Long id;
    private String description;
    private Date createdAt;
    private Date updateAt;
    private double enabled;

    private static FlagDTO create(Flag f){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(f, FlagDTO.class);

    }
}
