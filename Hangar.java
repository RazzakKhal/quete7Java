public class Hangar {
    public static void main(String... args){
        Car car1 = new Car("Peugeot", 125400);
        Boat boat1 = new Boat("Lamborghini", 12900);
        System.out.println(car1.doStuff());
        System.out.println(boat1.doStuff());
    }
}
