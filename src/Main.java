public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(0);

        while(true) {
            c1.speedUp();
            c1.step();
        }

    }
}