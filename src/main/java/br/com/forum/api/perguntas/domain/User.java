package br.com.forum.api.perguntas.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    private String email;
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthdate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Temporal(TemporalType.TIMESTAMP)
    private Date UpdateAt;
    private double enabled;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;


}
