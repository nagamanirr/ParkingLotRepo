public class GateKeeper {





public static void main(String[] args)
{
    ParkingLot parkingLot = new ParkingLot(3);
    parkingLot.setMaxCapacity(3);

 Parkable car3=new Car(parkingLot);
    car3.unpark();
    car3.park();
    car3.unpark();
    car3.park();
    car3.park();
    car3.park();
    car3.park();
    car3.park();

    Car c2=new Car();
    ParkingLot p1 = new ParkingLot(7);
    ParkingLot p3 = new ParkingLot();
    p3.setMaxCapacity(7);
    p3.setCapacity(7);

    c2.setParkingLot(p1);
    c2.getParkingLot();


}






}
