package f_stringConcepts;

//String is a mutable type object
public class Example1{
 public static void main(String[] args) {
     String s1 = new String("java"); //creating new string object and initializing constructor with "java"
     String s2 = "java"; //implicitly creates a string object and initializing constructor with "java"
     System.out.println(s1==s2);
     System.out.println(s1.equals(s2)+"\n"); 

     String s3 = "Java";
     System.out.println(s1.equals(s3));
     System.out.println(s1.equalsIgnoreCase(s3)+"\n"); //compares 2 object values without checking its case

     Object o1 = "Java";
     String s4 = new String("Java");
     System.out.println(o1);
     //direct reference value comparison without creating new object
     System.out.println(o1==s3);
     System.out.println(o1==s4);
     System.out.println(o1.equals(s4));
     // System.out.println(o1.equalsIgnoreCase(s4));-->CTE because Object class doesn't have equalIgnoreCase()
 }
}