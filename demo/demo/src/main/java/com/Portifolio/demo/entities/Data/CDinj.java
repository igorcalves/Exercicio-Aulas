package com.Portifolio.demo.entities.Data;

public class CDinj {
    public static void main(String[] args) throws Exception {
        CD cd = new CD();
        cd.supremeCreate("igor Alves", "26/12/1997", 
        "47716544865", "igor193@live.com", "CEO", 15000.00);

        cd.supremeCreate("igor pereira", "26/12/1997", 
        "47716544865", "igor193@live.com", "CEO", 15000.00);

       cd.showall();
    }
    
}
