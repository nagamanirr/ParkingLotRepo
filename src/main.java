public class main {

public static void main(String[] args)
{
    Car car1=new Car();
    ParkingLot parkingLot=new ParkingLot(2);
    car1.park(parkingLot);
    Car car2=new Car();
    car2.park(parkingLot);
    System.out.println(parkingLot.isfull());
    car1.unpark(parkingLot);
    System.out.println(parkingLot.isfull());


}




}
