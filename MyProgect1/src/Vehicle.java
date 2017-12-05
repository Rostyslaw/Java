public class Vehicle {
    private String color;

    Vehicle(){
        this.setColor("Red");
    }

    Vehicle(String c){
        this.setColor(c);
    }

    //Setter
    public void setColor(String c){
        this.color = c;
    }

    public void printColor(){
        System.out.println(color);
    }
}
