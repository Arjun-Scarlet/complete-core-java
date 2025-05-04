package e_oopsConcepts.Binding.LateBinding;

//Binding a method call with method implementation at runtime is called late Binding.
//Override method implementation is binded at runtime
class Cycle {
 void start(){
     System.out.println("Cycle unlocked");
 }
 void accelerate(){
     System.out.println("Cycle accelerated");
 }
 void stop(){
     System.out.println("Cycle stopped");
 }
}
class Hero extends Cycle {
 void start(){
     System.out.println("Hero cycle unlocked");
 }
 void accelerate(){
     System.out.println("Hero cycle accelerated");
 }
 void stop(){
     System.out.println("Hero cycle stopped");
 }
}
class Atlas extends Cycle {
 void start(){
     System.out.println("Atlas cycle unlocked");
 }
 void accelerate(){
     System.out.println("Atlas cycle accelerated");
 }
 void stop(){
     System.out.println("Atlas cycle stopped");
 }
}
class Atlas_1 extends Cycle {
 void start(){
     System.out.println("Atlas_1 cycle unlocked");
 }
 void accelerate(){
     System.out.println("Atlas_1 cycle accelerated");
 }
 void stop(){
     System.out.println("Atlas_1 cycle stopped");
 }
}
class Hercules extends Cycle {
 void start(){
     System.out.println("Hercules cycle unlocked");
 }
 void accelerate(){
     System.out.println("Hercules cycle accelerated");
 }
 void stop(){
     System.out.println("Hercules cycle stopped");
 }
}