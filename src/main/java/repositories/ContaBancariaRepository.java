package repositories;

import models.ContaBancaria;

import java.util.ArrayList;

public class ContaBancariaRepository {

    public ContaBancaria save (ContaBancaria contaBancaria){

        return new ContaBancaria();
    }
    public List<ContaBancaria> findAll(){
        return new ArrayList<>();
    }

}
