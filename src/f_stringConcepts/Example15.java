package f_stringConcepts;

//replace(input1, input2)
public class Example15 {
 public static void main(String[] args) {
     String s1 = "developer";
     System.out.println(s1.replace("vel", "VEL"));
     System.out.println(s1.replace('e', '$'));
     System.out.println(s1.replace("e", "")); //deletes the element

     String s2 = "VELO";
     char ch = 'e';
     System.out.println(s1.replace("velo", s2));
     System.out.println(s1.replace(ch, 'k'));
     System.out.println(s1.replace(ch+"", "ab")); //giving character as a string by concatenating with emply string(i.e:"")
 }
}
