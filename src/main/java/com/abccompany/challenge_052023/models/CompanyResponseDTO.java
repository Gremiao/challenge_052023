package com.abccompany.challenge_052023.models;

import com.abccompany.challenge_052023.repositories.CompanyRepository;

public record CompanyResponseDTO(String cnpj, String cep, String nome_fantasia, String uf) {
    public CompanyResponseDTO(CompanyModel sp){
        this(sp.getCnpj(), sp.getCep(), sp.getNome_fantasia(), sp.getUf());
    }
}
