package e_oopsConcepts.Cloning.Shallow;

// In Shallow cloning, referred properties are not going to be cloned
// It will only copy the reference to the cloned object
// It copies only outer object and the inner object is shared
// Changes in cloned object affects original object
class Address implements Cloneable {
    String state;
    String country;

    Address(String s, String c) {
        state = s;
        country = c;
    }

    @Override
    public String toString() {
        return "Address[State: " + state + ", Country: " + country + "]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
