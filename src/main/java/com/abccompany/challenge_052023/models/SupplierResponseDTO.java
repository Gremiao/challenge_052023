package com.abccompany.challenge_052023.models;

public record SupplierResponseDTO(String nome, String email, String cep, String cnpj, String cpf, String rg, String data_nascimento, String tipo_pessoa) {
    public SupplierResponseDTO(SupplierModel sp){
        this(sp.getNome(), sp.getEmail(), sp.getCep(), sp.getCnpj(), sp.getCpf(), sp.getRg(), sp.getData_nascimento(), sp.getTipo_pessoa());
    }
}
