public class Car extends Vehicle
{
    private String make = "";
    protected int numOfWh = 0;

    public void setMake(String make) 
    {
        this.make = make;
    }

    public Car() 
    {
        System.out.println("This is the car object");
    }

    public Car( String make, int numOfWh) 
    {
        super("Red", 1997);
        this.make = make;
        this.numOfWh = numOfWh;
        System.out.println("This is a specific car object");
    }
}
