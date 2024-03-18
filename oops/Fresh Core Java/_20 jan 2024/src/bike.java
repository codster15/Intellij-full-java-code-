

abstract class Vehicle{

    public abstract void engine();
}
public class  bike extends Vehicle{

    @Override
    public void engine() {
        System.out.println("bike engine");
    }

    public static void main(String[] args) {
        Vehicle b = new bike();
        b.engine();
    }



}





