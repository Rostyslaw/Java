import Samles.Machine;

public class MyClass {

    public static void main(String[] args) {
        Machine m = new Machine() {
            @Override public void start(){
                System.out.println("Wooo");
            }
        };
        m.start();
    }
}