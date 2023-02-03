import java.util.Random;

public class Car {
    private int speed;
    private int time;
    private int distance;
    private Random r = new Random();
    private Weel[] weels = new Weel[4];

    public Car(int speed) {
        this.speed = speed;

        for(int i = 0; i < 4; i++)
            weels[i] = new Weel(14, 2.3);
    }
    public void speedUp() {
        speed += 10;
    }
    public void speedDown() {
        speed -= 10;
    }
    public void printSpeed() {
        System.out.println(speed);
    }
    public void step() {
        for(int i = 0; i < 4; i++) {
            weels[i].changePress(r.nextDouble());
            System.out.println("Колесо №" + (i + 1));
            weels[i].printPress();
        }
        distance += speed;
        time++;
        System.out.println("Время " + time + " Пройдено " + distance);
    }
}
class Weel {
    private double dia;
    private double press;
    public Weel(double d, double p) {
        this.dia = d;
        this.press = p;
    }
    public void changePress(double delta) {
        if(press - delta > 0)
            press -= delta;
        else {
            System.out.println("Колесо спустило. Стоп.");
            System.exit(0);
        }
    }
    public void printPress() {
        System.out.println("Давление: " + press);
    }
}