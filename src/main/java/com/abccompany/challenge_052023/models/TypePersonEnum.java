package com.abccompany.challenge_052023.models;

public enum TypePersonEnum {
     PESSOA_JURIDICA("Pessoa Juridica")
    ,PESSOA_FISICA("Pessoa Fisica");

    private String label;
    TypePersonEnum(String label) {
        this.label = label;
    }
}
