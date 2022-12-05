package com.Portifolio.demo.entities;

import java.text.SimpleDateFormat;

public class t {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public static void main(String[] args) throws Exception {
        Company allSafe = new Company("AllSafe", sdf.parse("26/12/1997"));

    }
    
}
