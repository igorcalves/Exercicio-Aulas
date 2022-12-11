package com.Portifolio.Model.entities;

import com.Portifolio.Model.entities.Data.DataGenerated;

public class t {

    public static void main(String[] args) throws Exception {
    

    DataGenerated dg = new DataGenerated();


    dg.uploadRandomDate();


    System.out.println(dg.getCompanyEmployee().getEmployeeName());
    System.out.println(dg.getCompanyEmployee().getEmail());
    System.out.println(dg.getFirstName());
    System.out.println(dg.getJobFunction().getJobFunctionName());
    System.out.println(dg.getJobFunction().getSalary());

    
      }

    

    }
    
