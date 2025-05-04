package e_oopsConcepts.Abstraction.Interface;

//By using interface, we can achieve Multiple inheritance(i.e: a subclass is inherited from more than 1 superclass)
interface Father{
 void voice();
 void character();
}
interface Mother{
 void color();
 void character();
}
class Son implements Father,Mother{
 @Override
 public void voice() {
     System.out.println("Hard voice tone");
 }
 @Override
 public void character() {
     System.out.println("Bold creative character");
 }

 @Override
 public void color() {
     System.out.println("White color");
 }
}
public class ExInterface3 {
 public static void main(String[] args) {
     Father s1 = new Son();
     s1.voice();
     s1.character();
     // s1.color(); -->CTE
     System.out.println("---------");

     Mother s2 = new Son();
     s2.color();
     s2.character();
     // s2.voice(); -->CTE
 }
}
