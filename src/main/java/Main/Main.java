package Main;

import Main.Bus;
public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();

        bus1.setNumber(100);
        bus2.setNumber(200);
        bus1.AddClient(2);
        bus1.AddOil(-50);
        bus1.AddOil(10);
        bus1.AddClient(45);
        bus1.AddClient(5);
        bus1.AddOil(-55);

//        bus2.start();
//        bus2.addSpeed(20);
//        bus2.addPassenger(15);
//        bus2.checkFuel();
//        bus2.stop();
//        bus2.checkFuel();
    }
}

