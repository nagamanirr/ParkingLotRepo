public class ParkingLot {

    private int maxCapacity;
    private int capacity;
    public ParkingLot() {
    }

    public ParkingLot(int capacity) {
        this.capacity = capacity;

    }

    public ParkingLot(int maxCapacity,int capacity) {
        this.maxCapacity = maxCapacity;
        this.capacity = capacity;

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }





    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }



    public boolean isfull() {

        if (capacity == 0)
            return true;
        else
            return false;


    }

    public boolean parkCar() {
        if (!isfull())
        {
            capacity--;
            return true;
        }
        else
        {
            return false;
        }

    }
public boolean unparkCar()
{
if(isEmpty())
{
    return false;
}
capacity++;
return true;

}

    private boolean isEmpty() {
        if (capacity == maxCapacity){
            return true;
        }
        else {
            return false;
        }
    }

    public void parkCarinterface()
   {
       System.out.println("can be parked");

   }


    public void unparkCarinterface()
    {
        System.out.println("can not be parked");

    }





}
