package com.abccompany.challenge_052023.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Table(name = "tb_company")
@Entity(name = "company")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class CompanyModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "cnpj", nullable = false, length = 18)
    private String cnpj;

    @Column(name = "cep", nullable = false, length = 9)
    private String cep;

    @Column(name = "nome_fantasia", nullable = false)
    private String nome_fantasia;

    @Column(name = "uf", nullable = false, length = 2)
    private String uf;

    public CompanyModel(String cnpj, String cep, String nome_fantasia, String uf) {
        this.cnpj = cnpj;
        this.cep = cep;
        this.nome_fantasia = nome_fantasia;
        this.uf = uf;
    }

}
