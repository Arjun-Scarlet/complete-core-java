package e_oopsConcepts.Inheritance.NonPrimitiveTCast.DownCast;

import java.util.*;
class VegShop {
    // Implicit upcasting occurs when an object of a subclass(Carrot, Potato) is assigned to a reference variable of its superclass(Vegetable)
    // In otherwords, Implicit upcasting happens when Vegetable type method returning subclass type objects 
    Vegetable sell(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Opt-1: Carrot\nOpt-2: Potato\nEnter: ");
        int opt = sc.nextInt();
        if(opt==1) return new Carrot();
        if(opt==2) return new Potato();
        if(opt==3) return new Cabbage();
        return null;
    }
}