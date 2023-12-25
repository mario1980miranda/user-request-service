package com.codetruck.clients_service.repositories;

import com.codetruck.clients_service.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientsRepository extends JpaRepository<Client, Long> {
}
