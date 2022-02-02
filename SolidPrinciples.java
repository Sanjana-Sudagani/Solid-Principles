import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
// CarApp class - open for extension, closed for modification (OCP)
// (Liskov's Substitution principle) - CarApp class fully extended by Ola/Uber class
// DIP - classes should depend on abstractions and not concretions, invert the dependency we get the same output
abstract class CarApp implements IDrivable, IBookable {
    abstract void signUp(String name, String phone);

    abstract void editProfile(String name, String rename);
}
// Interface Segregation principle (Each interface with only one responsibility)
interface IDrivable {
    void showRoute(String start, String end);

    boolean checkAvailable(String car);
}
interface IBookable {
    void makeBooking(String car);

    String driverDetails(String car);
}
// SRP - Instead of single CarApp class, Ola/Uber can do it (SRP)
class Ola extends CarApp {
    List<String> carList;
    HashMap<String, String> carDriver;
    HashMap<String, String> driverDetails;
    String name;
    String email;
    String phone;
    Ola() {
        carList = new ArrayList<String>();
        carList.add("XUV");
        carList.add("Swift");
        carDriver = new HashMap<String, String>();
        carDriver.put("XUV", "Karthik");
        carDriver.put("Swift", "Vishnu");
        driverDetails = new HashMap<String, String>();
        driverDetails.put("Karthik", "9700234567");
        driverDetails.put("Vishnu", "8686357876");
    }
    void signUp(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    void editProfile(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public String driverDetails(String car) {

        return driverDetails.get(carDriver.get(car));
    }
    public void makeBooking(String car) {
        String driverName = carDriver.get(car);
        if (checkAvailable(car)) {
            System.out.println("Booking made by: " + name);
            System.out.println(car + " Booking Confirmed\nThe driver is " + driverName + "\nContact:"
                    + driverDetails.get(driverName));
        } else
            System.out.println(car + " is not Available");
    }
    public void showRoute(String start, String end) {
        System.out.println("The route starts from " + start + " to X to Y to Z " + end);
    }
    public boolean checkAvailable(String car) {

        return carList.contains(car);
    }
}
class Uber extends CarApp {
    List<String> carList;
    HashMap<String, String> carDriver;
    HashMap<String, String> driverDetails;
    String name;
    String email;
    String phone;
    Uber() {
        carList = new ArrayList<String>();
        carList.add("Ritz");
        carList.add("Innova");
        carDriver = new HashMap<String, String>();
        carDriver.put("Ritz", "Sagar");
        carDriver.put("Innova", "Vamshi");
        driverDetails = new HashMap<String, String>();
        driverDetails.put("Sagar", "970874567");
        driverDetails.put("Vamshi", "8682657876");
    }
    void signUp(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    void editProfile(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public String driverDetails(String car) {
        return driverDetails.get(carDriver.get(car));
    }
    public void makeBooking(String car) {
        String driverName = carDriver.get(car);
        if (checkAvailable(car)) {
            System.out.println("\nBooking made by: " + name);
            System.out.println(car + " Booking Confirmed\nThe driver is " + driverName + "\nContact:"
                    + driverDetails.get(driverName) + "\n");
        } else
            System.out.println(car + " is not Available");
    }
    public void showRoute(String start, String end) {
        System.out.println("\nThe route starts from " + start + " to X to Y to Z " + end);
    }
    public boolean checkAvailable(String car) {
        return carList.contains(car);
    }
}
public class SolidPrinciples {
    public static void main(String[] args) {
        CarApp ola = new Ola();
        ola.signUp("Sanjana", "1111111111");
        ola.showRoute("L. B. Nagar", "Hitech City");
        ola.makeBooking("Ritz");
        ola.makeBooking("XUV");

        Uber uber = new Uber();
        uber.signUp("Sanjana.S", "1023456789");
        uber.showRoute("Secunderabad", "Banjara Hills");
        uber.makeBooking("Innova");
    }
}

// import java.util.HashMap;
// import java.util.List;

// class ViolateSolidPrinciples {
//     String name;
//     String phone;

//     List<String> carList;
//     HashMap<String,String> carDriver;
//     HashMap<String,String> driverDetails;


//     void signUpOla(String name, String phone) {
//         this.name=name;
//         this.phone=phone;
//     }

//     void signUpUber(String name, String phone) {
//         this.name=name;
//         this.phone=phone;
//     }

//     public void makeBookingOla(String car) {
//         String driverName = carDriver.get(car);
//         if (checkAvailable(car)){
//             System.out.println("Booking made by: "+name);
//             System.out.println(car + " Booking Confirmed\nThe driver is "+driverName+"\nContact:"+driverDetails.get(driverName));
//         }
//         else
//             System.out.println(car+" is not Available");
//     }

//     public void makeBookingUber(String car) {
//         String driverName = carDriver.get(car);
//         if (checkAvailable(car)){
//             System.out.println("Booking made by: "+name);
//             System.out.println(car + " Booking Confirmed\nThe driver is "+driverName+"\nContact:"+driverDetails.get(driverName));
//         }
//         else
//             System.out.println(car+" is not Available");
//     }

//     public boolean checkAvailable(String car) {
//         return carList.contains(car);
//     }

// }

// interface IDrivable {
//     void showRoute(String start, String end);
//     boolean checkAvailable(String car);
//     void makeBooking(String car);
//     String driverDetails(String car);
// }