package e_oopsConcepts.toString_and_equals;

//By overriding toString(), we can customize the toString() implementation according to object states or data members
public class Test1 {
 int i;
 int j;
 public Test1(int i, int j){
     this.i = i;
     this.j = j;
 }
 @Override
 public String toString(){
     return "i = "+i+", j = "+j;
 }
 public static void main(String[] args) {
     Test1 t = new Test1(10, 20);
     System.out.println(t); // Before overriding toString(), it prints the address; After overriding, it prints the object values 
 }
}
