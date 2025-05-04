package e_oopsConcepts.Binding.LateBinding;

class CycleDriver {
    void drive(Cycle c){
        c.start();
        c.accelerate();
        c.stop();
    }
}
