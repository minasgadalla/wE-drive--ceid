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
 public String my_value;
 public int QR_id;
 public String car_id_request;

 public Driver[] car_info = new Driver[10];

 payment_details myDetail = new payment_details();
 wE - points myPoints = new wE - points();
 Car_Request request = new Car_Request();
 QR_codes QR_CODE = new QR_codes();


 public void select_car() {
  Scanner my_Object = new Scanner(System.in);
  System.out.println("Click Next To Display available Cars");
  String Next_Btn = my_Object.nextLine();
  if (Next_Btn.equals("Next")) {
   display_cars();
  } else {
   select_car();
  }
 }

 public void display_cars() {
  System.out.println("Loading available Cars");
  @Override
  protected void onCreate(Bundle savedInstanceState) {
   super.onCreate(savedInstanceState);
   setContentView(R.layout.activity_main);
  }
  String value = get_car_info();
  print_car_info(value);
 }

 public String get_car_info() {
  Car myCar = new Car();


  for (i = 0; i < car.car_number(); i++) {
   car_info[i] = myCar.car_data();
   return car_info[i];
  }
 }

 public void print_car_info(String my_value) {
  System.out.println(my_value);
  System.out.println("Now loading Cars Details Screen");
  screen_car_details();
 }

 public void screen_car_details() {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
   super.onCreate(savedInstanceState);
   setContentView(R.layout.activity_main_II);
  }

  System.out.println("Choose your Payment technic");
  Scanner my_Object = new Scanner(System.in);
  String Next_Btn = my_Object.nextLine();
  if (Next_Btn.equals("Card")) {
   card_return = pay_with_card();
   myDetail.save_option(); // It is called from payment_details Class
  } else if (Next_Btn.equals("we-Points")) {
   we - Points_return = pay_with_we_points();
   myPoints.save_option(); // It is called from wE-Points Class      
  } else {
   screen_car_details();
  }
  if ((card_return == true) && (we_Points_return == true)) {
   car_hold();
  } else {
   screen_car_details();
  }
 }
 
 public void car_hold()
    {
        request.User_Request(car_id_request);
        System.out.println("Loading QR Screen");
        load_QR_screen();
        
    }

 public boolean pay_with_card() {
  Scanner my_Object = new Scanner(System.in);
  System.out.println("Enter Your Card Number");
  String Next_Btn = my_Object.nextLine();
  if (!"".equals(Next_Btn)) {
   return true;
  } else {
   return false;
  }
 }

 public boolean pay_with_we_points()
    {
        Scanner my_Object = new Scanner(System.in);
        System.out.println("Choose the amount of we-Points");
        String Next_Btn = my_Object.nextLine();
        if (!"".equals(Next_Btn))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

 public void load_QR_screen() {
  System.out.println("Displaying QR_screen");
  System.out.println("Please check the QR-code");
  scan();
  // check_QR(); //Could we call it here??
 }

 public void scan() {
  Scanner scanning = new Scanner(System.in);
  System.out.println("Choose to Scan Qr Code");
  String Next_Btn = scanning.nextLine();
  if (Next_Btn.equals("QR-Code")) {
   check_QR(QR_CODE.QR_id);
  } else {
   scan();
  }
  }

 public void check_QR(int QR_id)
    {
        if (QR_id == 202) //elegxos me to QR_id tou autokinitou proswrina 202
        {
            System.out.println("Successful");
            status = ret_qr_validity();
        }
        else
        {
            status = false;
            go_to();
        }
    }
 
 public boolean ret_qr_validity()
    {
        return true;
    }

 public void go_to()
    {
        switch(status)
        {
            case false:
                System.out.println("Wrong Scanning please repeat");
                load_QR_screen();
            case true:
                System.out.println("Success");
                System.out.println("Showing complete period of Usage");
                
                time();
                // Displaying screen for time period...Not ready yet!
            default:
                break;
        }
        
    }
public void time()
    {
        System.out.println("Time of use is:");
        Total_time = get_time();
        System.out.println(Total_time);
    }
 public int get_time()
    {
        Total_time = end_time - start_time;
        return Total_time;    
    }
}
