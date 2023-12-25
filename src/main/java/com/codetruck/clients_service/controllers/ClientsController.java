package com.codetruck.clients_service.controllers;

import com.codetruck.clients_service.dto.ClientDTO;
import com.codetruck.clients_service.services.ClientsService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientsController {

    private final ClientsService service;

    public ClientsController(final ClientsService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Page<ClientDTO>> findAll(Pageable pageable) {
        Page<ClientDTO> result = service.findAll(pageable);
        return ResponseEntity.ok().body(result);
    }
}
