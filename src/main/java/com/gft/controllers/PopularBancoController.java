package com.gft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gft.services.PopularBancoService;

@RestController
@RequestMapping("v1/popular-banco")
public class PopularBancoController {

    @Autowired
    PopularBancoService bancoService;

    @PostMapping
    public ResponseEntity<ClienteController> popularBanco() {
        bancoService.popularBanco();
        return ResponseEntity.ok().build();
    }

}
