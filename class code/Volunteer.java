import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.lang.*;



/**
 *
 * @author user
 */
public class Volunteer extends User 
{
    public String user_id;
    public String coordinates; //volunteer
    public String location;
    public String Next_btn;
    public long Time;
    public long End_Time;
    public int number_of_volunteers;
    boolean answer;
    private int counter =0;
    private int min_distance;

    /**
     *
     */
    public Volunteer[] places = new Volunteer[10];
    Car myCars = new Car();
    
    
    public Volunteer(String user_id ,String coordinates)
    {
        this.user_id = user_id;
        this.coordinates=coordinates;
    }

    
    
    public void load_screen()
    {
        Scanner my_Object = new Scanner(System.in);
        System.out.println("Click Next");
        String Next_Btn = my_Object.nextLine();
        if (Next_Btn.equals("Next"))
        {
            display_request();
        }
        else
        {
            load_screen();
        }
        
        
    }
    
    public void display_request()
    {
        Scanner my_Obj = new Scanner(System.in);
        System.out.println("Please be prompt with your choice of volunteer ");
        Time = System.currentTimeMillis();
        
        if(Time <180)
        {
            String Next_Btn = my_Obj.nextLine();
            switch (Next_Btn) {
                case "Accept":
                    accept_request();
                    break;
                case "Decline":
                    decline_request();
                    break;
                default:
                    Time = System.currentTimeMillis()-Time;
                    display_request();
                    break;
            }
        }
        else
        {
            decline_request();
        }
        search_valid_volunteer();
        
                
        
        
    }
    
    public boolean accept_request()
    {
        number_of_volunteers++;
        answer = true;
        return answer;
    }
    
    public void decline_request()
    {
        System.out.println("Main Menu");
        // Main_Menu(); //From User Class
    }
    
    public void search_valid_volunteer()
    {
        if (number_of_volunteers == 0)
        {
            load_screen();
        }
        //answer = true;
        //return answer;
        search_close_volunteer();
    }
    
    public void search_close_volunteer() //Gps Coordinates are needed for accurate result
    {
        Scanner id1 = new Scanner(System.in);
        Scanner id2 = new Scanner(System.in);
        coordinates = id1.nextLine();
        location = id2.nextLine();
        //We compare every available volunteer in the area problably a bit off
        //due to the fact that we dont have a database.
        while(counter< number_of_volunteers)
        {
            //What do we have here ?? Ckecking it!
            places[counter]=new Volunteer(id1, id2); 
            counter++;
        }
        
        for(int i=0; i<myCars.car_location(); i++)
        {
            if((myCars.car_location[i] - coordinates) < min_distance)
            {
                min_distance = myCars.car_location[i] - coordinates;
            }     
        }
        
        select_volunteer(coordinates); 
    }
    
    public void select_volunteer(int coordinates)
    {
        Scanner my_Obj = new Scanner(System.in);
        if(this.coordinates == user_id.coordinates)
        {
            String choice = my_Obj.nextLine();
            switch (choice) {
                case "OK":
                    confirm();
                    break;
                case "Decline":
                    decline();
                    break;
                default:
                    break;
            }
        }
        else
        {
            showError();
        }
    }
    
    public void showError()
    {
        System.out.println("There is a problem with your request, please try again");
    }
    
    public void confirm()
    {
        System.out.println("Confirmed");
        //Load_screen();
    }
    public void decline()
    {
        System.out.println("Declined");
        //Load_screen();
    }
    
    public void load_screen()
    {
        System.out.println("Loading GPS route");
        System.out.println("Please confirm route:");
        // We will think anout adding it instead of two System.outs
       /*
       @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }
        */
   
    }
    
  //These two functions need to be relocated!!.... The commiter can take care of it! (194 -- 206).
    
    
   

/// Not final version . Scanning is required



}

//Dont delete anything!
