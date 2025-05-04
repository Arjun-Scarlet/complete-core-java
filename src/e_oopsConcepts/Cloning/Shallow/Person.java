package e_oopsConcepts.Cloning.Shallow;

class Person implements Cloneable {
    String name;
    String phnNo;
    Address address; //it is reference and it will be copied

    Person(String n, String phone, Address a) {
        name = n;
        phnNo = phone;
        address = a;
    }

    @Override
    public String toString() {
        return "Person[Name: " + name + ", Phone: " + phnNo + ", " + address + "]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}