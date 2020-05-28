public class car {

 public int id;
 private int battery_pre = 100;
 public String cordinates;
 private String comments;
 private String last_service;
 public boolean lock; // states whether  the car is locked or  not

 car(int idd, int bat) {
  this.id = idd;
  this.battery_pre = bat;
  this.cordinates = "10:10:10";
  this.last_service = "1/1/2020";
  this.lock = false;

 }

 public boolean valid_parking_zone(String cord) {
  if (cord != null && !cord.isEmpty()) {
   return true;
  } else {
   return false;
  }
 }

 public boolean car_battery() {
  if (this.battery_pre < 20) {
   return true;
  } else {
   return false;
  }
 }

}
