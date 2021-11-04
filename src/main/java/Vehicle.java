public class Vehicle 
{
    private String color = "";
    private int model = 0;

    public void setColor(String color) 
    {
        this.color = color;
    }

    public Vehicle() 
    {
        System.out.println("This is the vehicle object");
    }
    
    public Vehicle(String color, int model) 
    {
        System.out.println("This is the specific vehicle object");
    }
    
}
