import java.util.Scanner;
import java.util.Scanner;

public class car {

 public int id;
 private int battery_pre;
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

 public int getid() {
  return this.id;
 }
 public int getbat() {
  return this.battery_pre;
 }

 public void startDrive() {
  Scanner in2 = new Scanner(System.in);
  System.out.println("--------------------");
  System.out.println("--------------------");
  System.out.println("Tsouf tsouf. You are driving:");
  System.out.println("   Car ID: " + this.getid());
  System.out.println("   Battery Precentage: " + this.getbat() + "%");
  System.out.println("");
  boolean quit = false;
  while (!quit) {
   System.out.println("Options:");
   System.out.println("   1.Terminate ride");
   System.out.println("   2.Pause ride");

   int menuItem = in2.nextInt();
   switch (menuItem) {
    case 1:
     System.out.println("You've chosen to Terminate");

    case 2:
     System.out.println("You've chosen to Pause the ride");

    default:
     System.out.println("Invalid choice.");
   }
  }
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
