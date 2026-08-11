public class Main {
    public static void main(String[] args) {

        Engine engine1 = new Engine();
        Car car1 = new Car(engine1);

        car1.start();
    }
}
