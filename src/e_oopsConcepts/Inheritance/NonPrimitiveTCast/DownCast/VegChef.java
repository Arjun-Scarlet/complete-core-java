package e_oopsConcepts.Inheritance.NonPrimitiveTCast.DownCast;

public class VegChef {
    public static void main(String[] args) {
        VegShop s = new VegShop();
        Vegetable v = s.sell();
        if(v instanceof Carrot){
            ((Carrot)v).prepareHalwa(); // downcasting and method calling
        }
        if(v instanceof Potato){
            ((Potato)v).prepareFries();
//    		((Cabbage)v).prepareFries();-->ClassCastException
        }
    }
}
