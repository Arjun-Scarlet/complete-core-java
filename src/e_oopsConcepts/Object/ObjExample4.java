package e_oopsConcepts.Object;

//getClass() used to return class_name with package/class information
//getClass().getSimpleName() used to return only class_name of the object
class Red{

}
class Blue{

}
class Name{
 static void getClassName(Object o){
     System.out.println("Returns class info with obj_name => "+o.getClass());
     System.out.println("Returns only class name => "+o.getClass().getSimpleName());
 }
}
public class ObjExample4 {
 public static void main(String[] args) {
     Red r1 = new Red();
     Blue b1 = new Blue();

     Name.getClassName(r1);
     System.out.println("---------");
     Name.getClassName(b1);
 }
}
