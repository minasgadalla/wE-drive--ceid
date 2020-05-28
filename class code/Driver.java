import java.util.Scanner;
import android.*;
import java.time.*;

/**
 *
 * @author user
 */
public class Driver extends User {
    
    public int start_time;
    public int end_time;
    public int Total_time;
    public float initial_battery_percentage;
    public float final_battery_percentage;
    public String value;
    public boolean status;
    public boolean card_return;
    public boolean we_Points_return;

    public Driver[] car_info = new Driver[10];
    
    payment_details myDetail = new payment_details();
    wE-points myPoints = new wE-points();
    Car_Request request = new Car_Request();
    QR_codes QR_CODE = new QR_codes();
    
    
    public void select_car()
    {
        Scanner my_Object = new Scanner(System.in);
        System.out.println("Click Next To Display available Cars");
        String Next_Btn = my_Object.nextLine();
        if (Next_Btn.equals("Next"))
        {
            display_cars();
        }
        else
        {
            select_car();
        } 
    }
    
    public void display_cars()
    {
        System.out.println("Loading available Cars");
       @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }
        String value = get_car_info();
        print_car_info(value);
    }
