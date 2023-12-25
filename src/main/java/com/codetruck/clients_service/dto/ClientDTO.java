package com.codetruck.clients_service.dto;

import com.codetruck.clients_service.model.Client;
import lombok.*;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ClientDTO {
    private Long id;
    private String login;
    private String name;
    private String location;
    private String avatarUrl;
    private Integer followers;
    private Integer following;
    private Instant created;
    private String reposUrl;
    private String company;

    public ClientDTO(Client entity) {
        this.id = entity.getId();
        this.login = entity.getLogin();
        this.name = entity.getName();
        this.location = entity.getLocation();
        this.avatarUrl = entity.getAvatarUrl();
        this.followers = entity.getFollowers();
        this.following = entity.getFollowing();
        this.created = entity.getCreated();
        this.reposUrl = entity.getReposUrl();
        this.company = entity.getCompany();
    }
}
