package com.Portifolio.demo.entities.Data;

import java.text.SimpleDateFormat;
import java.util.Random;

import com.Portifolio.demo.entities.Company;


import net.datafaker.Faker;

public class DataGenerated {

    public String firstName;
    public String name;
    public String favoriteMusicGenre;
    public String favoriteFood;
    public String streetAddress;
    public String city;
    public String country;
    public String email;
    public String date ;
    public String cpf;
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    static void print(DataGenerated randomPerson){
        System.out.println(
            randomPerson
        );
    }
    public void datacr() {

        Faker randomData= new Faker();
    
        DataGenerated randomPerson
                = new DataGenerated();

            
        date = randomPerson.date  = sdf.format(randomData.date().birthday());

        cpf = randomPerson.cpf = randomData.cpf().valid();        
        firstName = randomPerson.firstName
                = randomData.name().firstName();
        name = randomPerson.firstName
                = randomData.name().firstName() + " " +  randomData.name().lastName();
     
    }
    private String randomEmailDomain(int num){
        switch (num){
            case 1 :
            return "@outlook.com";

            case 2:
            return "@gmail.com";

            case 3 :
            return "@yahoo.com";

            default:
            return "@live.com";
            
        }
    }

    private String randomJobFunction(int num){
        
        switch (num){
            case 1 :
            return "manager";

            case 2:
            return "Dev";

            case 3 :
            return "Director";

            default:
            return "intern";
            
        }
    }

    
    public void data(Company company) throws Exception{
        datacr();
        CD cd = new CD();

        Random aleatorio = new Random();
        Double salary;
        int num = aleatorio.nextInt(1,3);
        salary = aleatorio.nextDouble(2000,5000);
        String email = firstName+ randomEmailDomain(num);
        cd.atomicCreate(name, date, 
        cpf, email, randomJobFunction(num), salary, company);

       
    }
}