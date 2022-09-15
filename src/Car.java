import java.util.ArrayList;

public class Car {
    private int id;
    private String company;
    private String name;
    private String type;
    private String dateOdCreate;
    private int year;
    private ArrayList<Wheel> Wheels;
    private Engin engin;

    public Car(int id, String company, String name, String type, String dateOdCreate, int year, ArrayList<Wheel> Wheels,
            Engin engin) {
        this.id = id;
        this.company = company;
        this.name = name;
        this.type = type;
        this.dateOdCreate = dateOdCreate;
        this.year = year;
        this.Wheels = Wheels;
        this.engin = engin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDateOdCreate() {
        return dateOdCreate;
    }

    public void setDateOdCreate(String dateOdCreate) {
        this.dateOdCreate = dateOdCreate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<Wheel> getWheels() {
        return Wheels;
    }

    public void setWheels(ArrayList<Wheel> Wheels) {
        this.Wheels = Wheels;
    }

    public Engin getEngin() {
        return engin;
    }

    public void setEngin(Engin engin) {
        this.engin = engin;
    }

    /////

    static void createCar(ArrayList<Car> cars,int id, String company, String name, String type, String dateOdCreate, int year,
            ArrayList<Wheel> Wheels, Engin engin) {
        cars.add(new Car(id, company, name, type, dateOdCreate, year, Wheels, engin));
    }

    public void readCar() {
        System.out.println("ID:" + getId() + " , " + "Company: " + getCompany() + "\n"
                + "Name: " + getName() + " , " + "Type: " + getType() + "\n"
                + "Date Of Create: " + getDateOdCreate() + " , " + "Year:" + getYear());
        System.out.println("Wheels:");
        for (Wheel w : Wheels) {
            w.readWheel();
        }
        System.out.println("Engin:");
        engin.readEngin();
    }

    public void update(String company, String name, String type, String dateOdCreate, int year, ArrayList<Wheel> Wheels,
            Engin engin) {
        setCompany(company);
        setName(name);
        setType(type);
        setDateOdCreate(dateOdCreate);
        setYear(year);
        setWheels(Wheels);
        setEngin(engin);
    }

    static void updateCar(ArrayList<Car> cars, int id, String company, String name, String type, String dateOdCreate,
            int year, ArrayList<Wheel> Wheels,
            Engin engin) {
        for (Car w : cars) {
            if (w.getId() == id) {
                w.setCompany(company);
                w.setName(name);
                w.setType(type);
                w.setDateOdCreate(dateOdCreate);
                w.setYear(year);
                w.setWheels(Wheels);
                w.setEngin(engin);
                break;
            }
        }
    }

    static void deleteCar(ArrayList<Car> cars, int id) {
        int index = -1;
        for (Car w : cars) {
            index++;
            if (w.getId() == id) {
                cars.remove(index);
                break;
            }
        }
    }
}
