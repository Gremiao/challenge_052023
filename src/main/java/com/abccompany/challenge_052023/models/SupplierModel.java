package com.abccompany.challenge_052023.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Table(name = "tb_supplier")
@Entity(name = "supplier")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class SupplierModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "cep", nullable = false, length = 9)
    private String cep;

    @Column(name = "cnpj", length = 18)
    private String cnpj;

    @Column(name = "cpf", length = 14)
    private String cpf;

    @Column(name = "rg", length = 20)
    private String rg;

    @Column(name = "data_nascimento", length = 10)
    private String data_nascimento;

    @Column(name = "tipo_pessoa", length = 15)
    private String tipo_pessoa;

    public SupplierModel(String nome, String email, String cep, String cnpj, String cpf, String rg, String data_nascimento, String tipo_pessoa) {
        this.nome = nome;
        this.email = email;
        this.cep = cep;
        this.cnpj = cnpj;
        this.cpf = cpf;
        this.rg = rg;
        this.data_nascimento = data_nascimento;
        this.tipo_pessoa = tipo_pessoa;
    }

}
