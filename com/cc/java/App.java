package com.cc.java;


public class App {
    
    public static void main(String[] args) {
        
     /* Instanziierung Klasse --> Objekt */
     // Cat -- Referenztyp
     // cat -- Referenzvariable  

       Cat cat1 = new Cat("Grizabella", "white", 29);

    //    cat1.furColor =  "white";


        // output("Blick von aussen: " + cat1);
        // output(cat1.telYourAddress());

    // Wertzuweisung    
        // cat1.name = "Grizabella"; 
        // cat1.furColor = "white"; 
        // cat1.age = 29; 



        // Ausgabe 
        // output(cat1.name);
        // output(cat1.furColor);
        // output(Integer.toString(cat1.age)   );

        output(cat1.getName());
        output(cat1.getFurColor());
        output(Integer.toString(cat1.getAge()) );




        cat1.telYourAddress();

    

        // output(cat1.telYourAddress);
    
        output("--------");

    //System.out.println("----------");

        // Cat cat2 = new Cat();

        // // Wertzuweisung    
        // cat2.name = "Alonso"; 
        // cat2.furColor = "grey"; 
        // cat2.age = 35; 

        Cat cat2 = new Cat("Alonso", "grey", 35);
        // cat2 = new Cat("Alonso", "grey", 35);
        // cat2.name = "Alonso"; 



        //Ausgabe direkt
        output(cat2.getName());
        output(cat2.getFurColor());
        output(Integer.toString(cat2.getAge())   );

       


        
        cat2.telYourAddress();
        // System.out.println("Blick von aussen: "  + cat2);


    }   

    private static void output(String outStr) {
        System.out.println(outStr);
        
    }

}

