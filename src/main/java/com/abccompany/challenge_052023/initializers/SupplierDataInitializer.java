package com.abccompany.challenge_052023.initializers;

import com.abccompany.challenge_052023.models.SupplierModel;
import com.abccompany.challenge_052023.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class SupplierDataInitializer implements ApplicationRunner {

    @Autowired
    private SupplierRepository rep;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        rep.deleteAll();

        rep.save(new SupplierModel("Business_abc","company_abc@domain.com","45605-520","51.366.870/0001-10",null,null,null,"Pessoa Juridica"));
        rep.save(new SupplierModel("Firm_big","big_market@domain.com","57309-756","34.974.494/0001-27",null,null,null,"Pessoa Juridica"));
        rep.save(new SupplierModel("Company_result","result@domain.com","45606-248","72.449.461/0001-57",null,null,null,"Pessoa Juridica"));
        rep.save(new SupplierModel("Supply_ZX","supply_zx@domain.com","38071-070","64.681.315/0001-24",null,null,null,"Pessoa Juridica"));
        rep.save(new SupplierModel("TrueSupply","true_supply@domain.com","58087-230","33.171.640/0001-13",null,null,null,"Pessoa Juridica"));
        rep.save(new SupplierModel("BestDelivery","the_best_delivery@domain.com", "56502-185", "05.939.941/0001-09", null,null,null,"Pessoa Juridica"));

        rep.save(new SupplierModel("Aaron Smith","asmith@domain.com", "66110-790", null, "404.167.640-10","567895479","26/08/1975","Pessoa Fisica"));
        rep.save(new SupplierModel("Wilson Miller","wilson_miller@domain.com", "88050-400", null, "394.952.140-25","63564354","11/07/1980","Pessoa Fisica"));
    }
}
