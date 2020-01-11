
/**
 * A Vehicle.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle
{
    //A unique ID for the vehicle.
    private String ident;
    // The next destination of this vehicle.
    private String destination;
    // The location of this vehicle.
    private String location;

    /**
     * Constructor for objects of class Vehicle
     * 
     * @param id    The identification of the id of this Vehicle.
     */
    public Vehicle(String base, String id)
    {
        ident = id;
        location = base;
    }
    /**
     * Return the ID of the vehicle.
     * @return The ID of the vehicle.
     */
    public String getIdent()
    {
        return ident;
    }
    /**
     * Return the location of the taxi.
     * @return The location of the taxi.
     */
    public String getLocation()
    {
        return location;
    }
     /**
     * Return the destination of the vehicle.
     * @return The destination of the vehicle.
     */
    public String getDestination()
    {
        return destination;
    }
    /**
     * Return the status of this vehicle.
     * @return The status.
     */
    public String getStatus()
    {
        return ident + " at " + location + " headed for " +
               destination;
    }
    
    
    /**
     * Set the intented destination of the vehicle.
     * @param destination The intended destination.
     */
    public void setDestination(String destination)
    {
        this.destination = destination;
    }
    

}
