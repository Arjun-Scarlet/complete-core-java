package e_oopsConcepts.Encapsulation;

class Person{
	private String name;
	private int age;
	private String phn;
	private String city;
	Person(String name, int age, String phn, String city) {
		this.name = name;
		this.age = age;
		this.phn = phn;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		age = a;
	}
	
	public String getPhn() {
		return phn;
	}
	public void setPhn(String p) {
		phn = p;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String c) {
		city = c;
	}
}
public class Example2 {

	public static void main(String[] args) {
		Person p1 = new Person("Saiyan", 21, "8524044892", "Erode");
		System.out.println(p1.getName()+"\n"+p1.getAge()+"\n"+p1.getPhn()+"\n"+p1.getCity());
		System.out.println("-----------");
		p1.setName("Shadow");
		p1.setPhn("7896542540");
		System.out.println(p1.getName()+"\n"+p1.getAge()+"\n"+p1.getPhn()+"\n"+p1.getCity());
	}

}













