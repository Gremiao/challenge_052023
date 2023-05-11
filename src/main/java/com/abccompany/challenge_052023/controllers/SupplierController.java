package com.abccompany.challenge_052023.controllers;

import com.abccompany.challenge_052023.models.SupplierModel;
import com.abccompany.challenge_052023.models.SupplierRequestDTO;
import com.abccompany.challenge_052023.models.SupplierResponseDTO;
import com.abccompany.challenge_052023.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("supplier")
public class SupplierController {

    @Autowired
    private SupplierRepository repository;

    @CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
    @GetMapping
    public List<SupplierResponseDTO> getAllSuppliers(){
        return repository.findAll().stream().map(SupplierResponseDTO::new).toList();
    }

    @CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
    @PostMapping
    public void saveSupplier(SupplierRequestDTO data){
        repository.save(new SupplierModel(data.nome(), data.email(), data.cep(), data.cnpj(), data.cpf(), data.rg(), data.data_nascimento(), data.tipo_pessoa()));
    }
}
