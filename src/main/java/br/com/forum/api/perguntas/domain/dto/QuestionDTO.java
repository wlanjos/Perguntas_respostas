package br.com.forum.api.perguntas.domain.dto;

import br.com.forum.api.perguntas.domain.Flag;
import br.com.forum.api.perguntas.domain.Question;
import br.com.forum.api.perguntas.domain.User;
import lombok.Data;
import org.modelmapper.ModelMapper;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Data
public class QuestionDTO {

    private Long id;
    private User user;
    private Flag flag;
    private String Comment;
    private boolean resolved;
    private Date createdAt;
    private Date updateAt;
    private double enabled;

    public static QuestionDTO create(Question q){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(q, QuestionDTO.class);

    }

}
