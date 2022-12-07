package com.Portifolio.demo.entities;

import java.text.SimpleDateFormat;

public class t {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public static void main(String[] args) throws Exception {

        Company company = new Company();

        JobFunction func = new JobFunction("CEO", 10000.00);

        CompanyEmployee employee = new CompanyEmployee
        ("Igor alves", sdf.parse("26/12/1997"), "47716544845", "igor193@live.com", func);

        System.out.println(
        "Empresa: " + company.companyName +
        "\nO funcinario: " + employee.getName()+
        "\nNasceu: "+ employee.birthDate+
        "\nEmail: " + employee.getEmail() +
        "\ntem o salario de: " + employee.getJobFunction().getSalary() + 
        "\nCargo: " + employee.getJobFunction().getJobFunctionName());

    }
    
}
