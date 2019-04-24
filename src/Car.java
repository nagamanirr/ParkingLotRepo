public class Car implements Parkable{

private ParkingLot parkingLot;
     public Car(){

     }

    public Car(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    @Override
    public void park() {

       if(parkingLot.parkCar()){
           System.out.println("Parked the Car");
       }
       else{
           System.out.println("Parking full");
       }

    }

    @Override
    public void unpark() {

        if(parkingLot.unparkCar()) {
            System.out.println("un-parked the car");
        }
        else
        {
            System.out.println("Cannot unpark car , No car parked");
        }

    }
}
