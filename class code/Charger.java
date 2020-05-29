import java.util.Random;

public class Charger extends User {
 public float initial_battery_percentage;
 public float final_battery_percentage;
 public double car_initial_location;
 public double car_final_location;
 public int car_id;
 public double charge_station_location; /// Na mpei sto domain!

 Random rand = new Random(); // create a random ovject

 public void choose_car(int car_id) {
  System.out.println("Please select a car");
  if ((car_id == 202) && (this.initial_battery_percentage < 0.2)) //Checking if the current id exists! temp 202
  {
   load_QR_screen();
  } else {
   choose_car(car_id);
  }
 }

 public void load_screen() {
  System.out.println("Loading GPS route");
  System.out.println("Please confirm route:");
  confirm_route();
 }

 public void confirm_route() {
  if (on_click = true) //here we pass the user's choice with on_click ..error
  {
   coordinates(this.car_initial_location);
  } else {
   load_screen();
  }
 }

 public void coordinates(double car_initial_location) //Exei provlimata--
 {
  while (this.charge_station_location != this.car_final_location) {
   this.car_initial_location = this.car_final_location;
   coordinates(this.car_initial_location);
  }
  if (GPS_loc != this.car_final_location) {
   load_error_msg(); //Can be created in User Class
  }
  check_final_coordinates();
 }

 public void check_final_coordinates() {
  if (this.car_final_location == this.charge_station_location) {
   System.out.println("Displaying Stop Screen");
  } else {
   coordinates(this.car_final_location);
  }
 }
    
 public boolean choose_to_stop() {
  if (on_click == true) //Not assigned yet
  {
   return true;
  } else {
   load_error_msg();
  }
 }
    
}
