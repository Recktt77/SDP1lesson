package ass2.Abstract_Factory_Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Abstract Factory Pattern:");
        DeviceFactory appleFactory = new AppleFactory();
        Smartphone applePhone = appleFactory.createSmartphone();
        Laptop appleLaptop = appleFactory.createLaptop();
        applePhone.getDetails();
        appleLaptop.getDetails();
        DeviceFactory samsungFactory = new SamsungFactory();
        Smartphone samsungPhone = samsungFactory.createSmartphone();
        Laptop samsungLaptop = samsungFactory.createLaptop();
        samsungPhone.getDetails();
        samsungLaptop.getDetails();
        System.out.println();
    }
}
