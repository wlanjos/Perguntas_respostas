package br.com.forum.api.perguntas.domain.dto;

import br.com.forum.api.perguntas.domain.Role;
import br.com.forum.api.perguntas.domain.User;
import lombok.Data;
import org.modelmapper.ModelMapper;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Data
public class UserDTO {

    private long id;
    private String name;
    private String email;
    private Date birthdate;
    private Date createdAt;
    private Date UpdateAt;
    private double enabled;
    private Role role;


    public static UserDTO create(User user){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(user, UserDTO.class);

    }

}
