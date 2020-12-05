package br.com.forum.api.perguntas.domain.dto;

import br.com.forum.api.perguntas.domain.Question;
import br.com.forum.api.perguntas.domain.ReputationUser;
import br.com.forum.api.perguntas.domain.User;
import org.modelmapper.ModelMapper;

import java.util.Date;

public class ReputationUserDTO {
    private Long id;
    private float score;
    private Date createdAt;
    private Date updateAt;
    private double enabled;
    private User user;

    public static ReputationUserDTO create(ReputationUser reputationUser){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(reputationUser, ReputationUserDTO.class);

    }

}
