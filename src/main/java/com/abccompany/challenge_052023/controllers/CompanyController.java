package com.abccompany.challenge_052023.controllers;

import com.abccompany.challenge_052023.models.CompanyModel;
import com.abccompany.challenge_052023.models.CompanyRequestDTO;
import com.abccompany.challenge_052023.models.CompanyResponseDTO;
import com.abccompany.challenge_052023.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("company")
public class CompanyController {
    @Autowired
    private CompanyRepository repository;

    @CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
    @GetMapping
    public List<CompanyResponseDTO> getAllCompanies(){
        return repository.findAll().stream().map(CompanyResponseDTO::new).toList();
    }

    @CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
    @PostMapping
    public void saveCompany(@RequestBody CompanyRequestDTO data) {
        repository.save(new CompanyModel(data.cnpj(), data.cep(), data.nome_fantasia(), data.uf()));
    }

}
