
public class Charger extends User 
{
    public float initial_battery_percentage;
    public float final_battery_percentage;
    public double car_initial_location;
    public double car_final_location;
    public double charge_station_location;
    public int car_id;
    public int QR_id;
    public double GPS_loc;
    public int we_points;
    
    // create a random object for later use
    Random rand = new Random();
    
    public void constructor(float initial_battery_percentage,float final_battery_percentage,double initial_location,double final_location,double charge_station_location)
    { // not sure about this
        this.initial_battery_percentage = initial_battery_percentage;
        this.final_battery_percentage = final_battery_percentage;
        this.car_initial_location = car_initial_location;
        this.car_final_location = car_final_location;
        this.charge_station_location = charge_station_location;
    }
    
    public void choose_mode(){ //isws mporei na mpei sto User
        System.out.println("Loading Charger Screen");
        load_map();
    }
    
    public void load_map() // den xreiazetai edw
    {
        //calling car function and charger station function
        
    }
    
    public void choose_car(int car_id)
    {
        System.out.println("Please select a car");
        if ((car_id == 202) && (this.initial_battery_percentage < 0.2 ))//Checking if the current id exists! temp 202
        {
            load_QR_screen();
        }
        else
        {
            choose_car(car_id);
        }
    }
    
    public void load_QR_screen()
    {
        System.out.println("Displaying QR_screen");
        System.out.println("Please check the QR-code");
        // check_QR(); //Could we call it here??
    }
    
    public void check_QR(int QR_id)
    {
        if (QR_id == 202) //elegxos me to QR_id tou autokinitou proswrina 202
        {
            System.out.println("Successful");
            load_screen();
        }
        else
        {
            load_QR_screen();
        }
    }
    
    public void load_screen()
    {
        System.out.println("Loading GPS route");
        System.out.println("Please confirm route:");
        confirm_route();
    }
    
    public void confirm_route()
    {
        if(on_click = true) //here we pass the user's choice with on_click ..error
        {
            coordinates(this.car_initial_location);
        }
        else
        {
            load_screen();
        }
    }
    
    public void coordinates(double car_initial_location) //Exei provlimata
    {        
        while(this.charge_station_location != this.car_final_location)
        {
            this.car_initial_location = this.car_final_location; 
            coordinates(this.car_initial_location);
        }
        if (GPS_loc != this.car_final_location)
        {
            load_error_msg(); //Can be created in User Class
        }
        check_final_coordinates();
    }
    
    public void check_final_coordinates()
    {
        if(this.car_final_location == this.charge_station_location )
        {
            System.out.println("Displaying Stop Screen");
        }
        else
        {
            coordinates(this.car_final_location);
        }
    }
    public boolean choose_to_stop()
    {
        if (on_click == true) //Not assigned yet
        {
            return true;
        }
        else
        {
            load_error_msg();
        }
    }
    
    public int collect_wepoints(int we_points)
    {
        choose_to_stop();
        if(this.final_battery_percentage == 100 && choose_to_stop() == true)
        {
            we_points = we_points + rand.nextInt(250);
            return we_points;
            go_to();
        }
        else
        {
            check_final_coordinates();
        }
    }
    
    public void go_to()
    {
        //Kalei mia sinartisi tis klasis Termatismos Diadromis
    }            
}
