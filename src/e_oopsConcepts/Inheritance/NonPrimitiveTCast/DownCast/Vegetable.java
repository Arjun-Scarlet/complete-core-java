package e_oopsConcepts.Inheritance.NonPrimitiveTCast.DownCast;

class Vegetable {
    
}
class Carrot extends Vegetable{
    void prepareHalwa(){
        System.out.println("Tasty Halwa is Ready!");
    }
}
class Potato extends Vegetable{
    void prepareFries(){
        System.out.println("Crispy French fries are Ready!");
    }
}
class Cabbage extends Potato{
	void mushroom() {
		System.out.println("Mushroom is ready!");
	}
}