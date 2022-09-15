import java.util.ArrayList;

public class App {
    // Create a List for all Objects
    // Lists Weels
    static ArrayList<Wheel> wheels1 = new ArrayList<>();
    static ArrayList<Wheel> wheels2 = new ArrayList<>();
    static ArrayList<Wheel> wheels3 = new ArrayList<>();
    // List Engin
    static ArrayList<Engin> engins = new ArrayList<>();
    // List Cars
    static ArrayList<Car> cars = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        // call the Fuinctions thats create objects and add thier to Lists
        addWheels1ToList();
        addWheels2ToList();
        addWheels3ToList();
        addEnginsToList();
        addCarsToList();

        //Create a New Object Car And add to list cars
        Car.createCar(cars, 4, "sss", "as", "asd", "asd", 2018, wheels1, engins.get(0));
        //Create a New Object Wheel And add to list wheels
        Wheel.createWheel(wheels1,  5, 10, 200, "ad", 2);
        //Create a New Object Engin And add to list engins
        Engin.createEngin(engins, 1, "asldklsa", 555, 12, "sasss", 2);

        //Update Car from list cars
        cars.get(2).update( "marcedesss", "mrs11", "master", "1/2/2020", 2020, wheels2, engins.get(1));
        //Update Wheel from list wheels1
        wheels1.get(1).update(55555, 15555, "wasasd2", 1);
        //Update Engin from list engins
        engins.get(1).update("Gasoline1111", 220, 10, "koba", 1);

        // Read Data for Car 1
        cars.get(0).readCar();
        System.out.println("--------------------------------");
        // Read Data for Car 2
        cars.get(1).readCar();
        System.out.println("--------------------------------");
        // Read Data for Car 3
        cars.get(2).readCar();

        // Delete Well from List Wheels1 By ID
        Wheel.deleteWell(wheels1, 2);
        System.out.println(wheels1.size());
        // Delete Engin from List engins By ID
        Engin.deleteEngin(engins, 2);
        System.out.println(engins.size());
        // Delete Car from List cars By ID
        Car.deleteCar(cars, 3);
        System.out.println(cars.size());
    }

    // Fuinction thats create Wheel objects and add thier to List
    public static void addWheels1ToList() {
        Wheel w1 = new Wheel(1, 5, 15, "w2", 1);
        Wheel w2 = new Wheel(2, 5, 15, "w2", 1);
        Wheel w3 = new Wheel(3, 10, 20, "w1", 1);
        Wheel w4 = new Wheel(4, 10, 20, "w1", 1);
        wheels1.add(w1);
        wheels1.add(w2);
        wheels1.add(w3);
        wheels1.add(w4);
    }

    public static void addWheels2ToList() {
        Wheel w1 = new Wheel(1, 5, 15, "w2", 2);
        Wheel w2 = new Wheel(2, 5, 15, "w2", 2);
        Wheel w3 = new Wheel(3, 10, 20, "w1", 2);
        Wheel w4 = new Wheel(4, 10, 20, "w1", 2);
        wheels2.add(w1);
        wheels2.add(w2);
        wheels2.add(w3);
        wheels2.add(w4);
    }

    public static void addWheels3ToList() {
        Wheel w1 = new Wheel(1, 5, 15, "w2", 3);
        Wheel w2 = new Wheel(2, 5, 15, "w2", 3);
        Wheel w3 = new Wheel(3, 10, 20, "w1", 3);
        Wheel w4 = new Wheel(4, 10, 20, "w1", 3);
        wheels3.add(w1);
        wheels3.add(w2);
        wheels3.add(w3);
        wheels3.add(w4);
    }

    // Fuinction thats create Engin objects and add thier to List
    public static void addEnginsToList() {
        Engin e1 = new Engin(1, "deseale", 220, 10, "USA", 1);
        Engin e2 = new Engin(2, "Gasoline", 360, 8, "italian", 2);
        Engin e3 = new Engin(3, "deseale", 200, 4, "turkya", 3);
        engins.add(e1);
        engins.add(e2);
        engins.add(e3);
    }

    // Fuinction thats create Car objects and add thier to List
    public static void addCarsToList() {
        Car c1 = new Car(1, "tesla", "tesla1", "sport", "1/1/2021", 2022, wheels1, engins.get(0));        
        Car c2 = new Car(2, "BMW", "BMW1", "sport", "1/1/2020", 2022, wheels2, engins.get(1));
        Car c3 = new Car(3, "foard", "foard1", "sport", "1/1/2018", 2022, wheels3, engins.get(2));
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
    }
}
