package br.com.forum.api.perguntas.domain.dto;

import br.com.forum.api.perguntas.domain.Answer;
import br.com.forum.api.perguntas.domain.Flag;
import br.com.forum.api.perguntas.domain.Question;
import br.com.forum.api.perguntas.domain.User;
import lombok.Data;
import org.modelmapper.ModelMapper;

import java.util.Date;

@Data
public class AnswerDTO {

    private Long id;
    private User user;
    private Question question;
    private String comment;
    private Date createdAt;
    private Date updateAt;
    private double enabled;

    private static AnswerDTO create(Answer answer){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(answer, AnswerDTO.class);

    }

}
