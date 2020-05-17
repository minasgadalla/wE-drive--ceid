public class car {

 public int id;
 private int battery_pre = 100;
 public string cordinates;
 private string comments;
 private string last_service;
 public boolean lock; // states whether  the car is locked or  not

 public void valid_parking_zone(int cord) {
  if (cord are within the limits) {
   return true;
  } else {
   return false;
  }
 }

 public void car_battery() {
  if (this.battery_pre < 20 {
    return true;
   } else {
    return false;
   }
  }

 }
