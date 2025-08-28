public class Car {
    String color;
    String engine;
    int doors;

    Car(String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }

    public void info() {
        System.out.println("Color: " + this.color);
        System.out.println("Engine: " + this.engine);
        System.out.println("Doors: " + this.doors);
    }
}

class CarTest {

    public static void changeDoors(Car c, int newDoors) {
        c.doors = newDoors;
        System.out.println("Now door count is: " + c.doors);
    }

    public static void changeColor(Car c1, Car c2) {
        String tempColor = c1.color;
        c1.color = c2.color;
        c2.color = tempColor;
        System.out.println("Now Car 1 color is: " + c1.color + " and Car2 color is: " + c2.color);
    }

    public static void main(String[] args) {


        Car c1 = new Car("red", "V6", 2);
        System.out.println("Car 1 created: " + c1.color + " " + c1.engine + " " + c1.doors);
        Car c2 = new Car("white", "r4", 4);
        System.out.println("Car 2 created: " + c2.color + " " + c2.engine + " " + c2.doors);

        changeDoors(c1, 7);
        changeColor(c1, c2);

        c1.info();
        c2.info();

    }

}