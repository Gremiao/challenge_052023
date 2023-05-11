package com.abccompany.challenge_052023.initializers;

import com.abccompany.challenge_052023.models.CompanyModel;
import com.abccompany.challenge_052023.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CompanyDataInitializer implements ApplicationRunner {

    @Autowired
    private CompanyRepository rep;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        rep.deleteAll();
        rep.save(new CompanyModel("33.669.010/0001-73", "50800-160", "Max entregas ltda","RJ"));
        rep.save(new CompanyModel("99.609.909/0001-09", "64079-153", "Entregas Rapidas","SP"));
        rep.save(new CompanyModel("26.188.185/0001-01", "69085-170", "Fabrica sucesso","TO"));
        rep.save(new CompanyModel("26.029.435/0001-52", "79011-901", "WS solutions","RS"));
    }
}
