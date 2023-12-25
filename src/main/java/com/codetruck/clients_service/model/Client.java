package com.codetruck.clients_service.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "TB_CLIENT")
public class Client {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String name;
    private String location;
    @Column(name = "avatar_url")
    private String avatarUrl;
    private Integer followers;
    private Integer following;
    @Column(name = "created_at")
    private Instant created;
    @Column(name = "repos_url")
    private String reposUrl;
    private String company;
}
