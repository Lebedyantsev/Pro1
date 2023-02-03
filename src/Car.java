public class Car {
    private int speed;
    private Weel w1,w2,w3,w4;
    public Car(int speed) {
        this.speed = 0;
        w1 = new Weel(14, 2.3);
        w2 = new Weel(14, 2.1);
        w3 = new Weel(14, 2.2);
        w4 = new Weel(14, 2.0);
    }
    public void speedUp() {
        speed +=10;
    }
    public void speedDown() {
        speed -=10;
    }
    public void printSpeed() {
        System.out.println(speed);
    }
}
class Weel {
    private double dia;
    private double press;
    public Weel(double d, double p) {
        this.dia = d;
        this.press = p;
    }	}