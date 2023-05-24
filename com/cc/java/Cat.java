package com.cc.java;


public class Cat {

private String name;
private String furColor;
private int age;


public Cat(String name, String furColor, int age) {
   this.name = name;
   this.furColor = furColor;
   this.age = age;
}





// public String tellYourName() {
//   return this. name;
// }
// public String tellfurColor() {
//    return this.furColor;

// }
// public int tellYourAge() {
//    return this.age;
   
// }


// Getter
 public String getName() {
   if (this.checkPermission()) {
      return name;

   } else {
      return "Sorry"; 
      
   }
}

private boolean checkPermission() {
   return false;
}


public String getFurColor() {
   return furColor;
}

//Setter
public void setFurColor(String furColor) {
   this.furColor = furColor;
}

// Age
public int getAge() {
   return age ;

}

public void setAge(int age) {
   this.age = age;
}





// this ---> Instanzvariable //Selbstrefenz
 public String telYourAddress() {
    return("Blick von innen" + this);
    
    // System.out.println("Blick von innen: " + this);  

 }   




}
