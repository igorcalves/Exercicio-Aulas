package com.Portifolio.Model.entities;

import java.text.SimpleDateFormat;

import com.Portifolio.Model.entities.Data.DataGenerated;

public class t {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
    public static void main(String[] args) throws Exception {
    

    DataGenerated dg = new DataGenerated();

    dg.setCompany(new Company("allSafe",sdf.parse("26/12/1997")));
    
    dg.uploadRandomDate();


    //System.out.println(sdf.format(dg.getCompanyEmployee().getBirthDay()));
    dg.CreateJobFunction();
    System.out.println(dg.getJ1().getJobFunctionName());
    
      }

    

    }
    
