public class ParkingLot {

    private int capacity;


    public ParkingLot(int capacity) {
        this.capacity = capacity;

    }

    public boolean isfull() {

        if (capacity == 0)
            return true;
        else
            return false;


    }

    public void parkCar() {
        capacity--;

    }
public void unparkCar()
{

capacity++;
}


}
