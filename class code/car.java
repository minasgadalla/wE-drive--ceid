import java.util.Scanner;
import java.util.Scanner;

public class car {

 public int id;
 private int battery_pre;
 public String cordinates;
 private String comments;
 private String last_service;
 public boolean lock; // states whether  the car is locked or  not
 private boolean available;
 public int active_time;

 car(int idd, int bat) {
  this.id = idd;
  this.battery_pre = bat;
  this.cordinates = "10:10:10";
  this.last_service = "1/1/2020";
  this.lock = false;
  this.available = false;
  this.active_time = 0;
 }

 public int getid() {
  return this.id;
 }
 public int getbat() {
  return this.battery_pre;
 }

 public void startDrive() {
  routes rt = new routes();
  timer tm = new timer();
  tm.increaseTime();
  Scanner in2 = new Scanner(System.in);
  //timer time = new tsimer();
  System.out.println("--------------------");
  System.out.println("--------------------");
  System.out.println("Tsouf tsouf. You are driving:");
  tm.increaseTime();
  System.out.println("   Car ID: " + this.getid());
  System.out.println("   Battery Precentage: " + this.getbat() + "%");
  System.out.println("");
  for (int i = 0; i < (int)(this.getid() / 1000); i++) {
   tm.increaseTime();
  }

  boolean quit = false;
  while (!quit) {
   System.out.println("Options:");
   tm.increaseTime();

   System.out.println("   1.Terminate ride");
   System.out.println("   2.Pause ride");

   int menuItem = in2.nextInt();
   switch (menuItem) {
    case 1:
     System.out.println("You've chosen to Terminate");
     this.end_ride(tm, rt);
     quit = true;
     return;
    case 2:
     System.out.println("You've chosen to Pause the ride");

    default:
     System.out.println("Invalid choice.");
   }
  }
 }

 public void end_ride(timer tm, routes rt) {
  if (valid_parking_zone("10:10")) {
   System.out.println("----- Valid Parking zone.");
   System.out.println("----- Route Time " + tm.getTime() + "minutes");
   System.out.println("----- Route Cost " + rt.calculate_cost(tm.getTime()) + "€");
   this.active_time = tm.getTime();
   System.out.println("----- Route Time " + tm.getTime() + "minutes");


  }


 }
 public int ret_time(timer tm) {
  return tm.getTime();
 }



 public boolean valid_parking_zone(String cord) {
  if (cord != null && !cord.isEmpty()) {
   return true;
  } else {
   return false;
  }
 }


 public boolean check_battery() {
  if (this.battery_pre < 20) {
   return true;
  } else {
   return false;
  }
 }

 public String cordinates() {
  return this.cordinates;
 }

 public int car_details() {
  return this.id;

 }

}
