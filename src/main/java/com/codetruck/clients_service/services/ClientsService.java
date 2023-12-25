package com.codetruck.clients_service.services;

import com.codetruck.clients_service.dto.ClientDTO;
import com.codetruck.clients_service.model.Client;
import com.codetruck.clients_service.repositories.ClientsRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientsService {

    private final ClientsRepository repository;

    public ClientsService(final ClientsRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable) {
        Page<Client> clientsPage = repository.findAll(pageable);
        return clientsPage.map(ClientDTO::new);
    }
}
