package com.abccompany.challenge_052023.repositories;

import com.abccompany.challenge_052023.models.CompanyModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<CompanyModel, Long> {
}

