public class Charger_Stations extends Charger 
{
    //Some variables from "Charger" can be deleted , i'll update it later! 
    public int station_id;
    public int station_location;
    public String station_status;
    
    public void station(int station_id, int station_location, String station_status)
    {
        this.station_id = station_id;
        this.station_location = station_location;
        this.station_status = station_status;
    }  
    
    
}
