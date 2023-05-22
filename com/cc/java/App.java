package com.cc.java;


public class App {
    
    public static void main(String[] args) {
        
     /* Instanziierung Klasse --> Objekt */
     // Cat -- Referenztyp
     // cat -- Referenzvariable  

       Cat cat1 = new Cat();
        output("Blick von aussen: " + cat1);
        output(cat1.telYourAddress());

        cat1.telYourAddress();
        


        // output(cat1.telYourAddress);
       ;

        output("--------");

    //    System.out.println("----------");

        Cat cat2 = new Cat();
        output(cat2.telYourAddress());
        // System.out.println("Blick von aussen: "  + cat2);

        cat2.telYourAddress();


    }   

    public static void output(String outStr) {
        System.out.println(outStr);
        
    }

}

