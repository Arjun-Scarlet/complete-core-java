package e_oopsConcepts.toString_and_equals;

//By overriding equals(), we can compare two objects based on their values not their references
public class Test3 {
 int i;
 int j;
 public Test3(int i, int j) {
     this.i = i;
     this.j = j;
 }
 @Override
 public boolean equals(Object o){
     Test3 t = (Test3)o;
     return this.i==t.i && this.j==t.j;
 }
 public static void main(String[] args) {
     Test3 t1 = new Test3(10, 20);
     Test3 t2 = new Test3(10, 20);
     Test3 t3 = new Test3(15, 20);
     System.out.println(t1.equals(t2)); // Before overriding equals(), it compares 2 object address; After overriding, it compares the object values 
     System.out.println(t1.equals(t3));
 }
}
