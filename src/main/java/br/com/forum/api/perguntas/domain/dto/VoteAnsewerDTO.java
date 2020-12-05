package br.com.forum.api.perguntas.domain.dto;

import br.com.forum.api.perguntas.domain.Answer;
import br.com.forum.api.perguntas.domain.Question;
import br.com.forum.api.perguntas.domain.User;
import br.com.forum.api.perguntas.domain.VoteAnsewer;
import lombok.Data;
import org.modelmapper.ModelMapper;

import java.util.Date;

@Data
public class VoteAnsewerDTO {

    private Long id;
    private Question question;
    private Answer answer;
    private float score;
    private Date createdAt;
    private Date updateAt;

    public static VoteAnsewerDTO create(VoteAnsewer voteAnsewer){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(voteAnsewer, VoteAnsewerDTO.class);

    }
}
