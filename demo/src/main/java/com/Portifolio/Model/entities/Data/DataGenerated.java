package com.Portifolio.Model.entities.Data;
 

import java.text.SimpleDateFormat;
import java.util.Random;

import com.Portifolio.Model.entities.Company;
import com.Portifolio.Model.entities.CompanyEmployee;
import com.Portifolio.Model.entities.JobFunction;

import net.datafaker.Faker;


public class DataGenerated {

    private String firstName;
    private String name;
    private String email;
    private String date ;
    private String cpf;
    private String JbfName;
    private Double salary;
    

    
    
    public String getFirstName() {
        return firstName;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getDate() {
        return date;
    }
    public String getCpf() {
        return cpf;
    }
    public String getJbfName() {
        return JbfName;
    }
    public Double getSalary() {
        return salary;
    }
    private void dataVarRandomCreate() {

        Faker randomData= new Faker();
        Random aleatorio = new Random();
        
        int num = aleatorio.nextInt(1,3);

        DataGenerated randomPerson = new DataGenerated();
        
        date = randomPerson.date  = sdf.format(randomData.date().birthday());
        
        cpf = randomPerson.cpf = randomData.cpf().valid();        
        
        firstName = randomPerson.firstName = randomData.name().firstName();
        
        name =  firstName + " " +  randomData.name().lastName();
        
        email = this.firstName+ randomEmailDomain(num);
        
        salary = aleatorio.nextDouble(2000,5000);

        JbfName = randomJobFunction(num);
     
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

    
    public void uploadRandomDate() throws Exception{
        dataVarRandomCreate();
        atomicCreate(JbfName, salary, name, date, cpf, email);
    }

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


 


    private Company company;
    private JobFunction jobFunction;
    private CompanyEmployee companyEmployee;
    

    

    public JobFunction getJobFunction() {
        return jobFunction;
    }
    public CompanyEmployee getCompanyEmployee() {
        return companyEmployee;
    }
    public Company getCompany() {
        return company;
    }

    public  void atomicCreate
            (String jbFName,Double jbFSalary, // create jobfunction
             String employeName, String employeeBirthday, String employeeCpf, String employeeEmail)//create companyemployee
                throws Exception{
         jobFunction = new JobFunction(jbFName,jbFSalary);
         companyEmployee = new CompanyEmployee(employeName,
                                          sdf.parse(employeeBirthday),employeeCpf,employeeEmail,jobFunction);
        
        this.company = new Company("AllSafe", sdf.parse("26/12/1997"),companyEmployee);
        
    
       
       
        
        
    }
}
   