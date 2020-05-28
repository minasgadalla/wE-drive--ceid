/**
 * This is the main class which runs, destroys, creates -- its the God
 */

import java.util.Scanner;
import java.util.ArrayList; 

public class wEdrive {
 static User us = new User(true);
 static User testuser = new User(false);

 static void main() {

  int user_f_action;
  System.out.println("Hello To wE-drive. Please select from below");
  // show from the first menu -- login, register, exit
  user_f_action = menu_a();

  switch (user_f_action) {
   case 1:
    System.out.println("You have been logged in");
    System.out.println("Enjoy!");
    System.out.println("---------------------");
    menu_logged();
    break;
   case 2:
    user_register();
    menu_logged();
    break;
   default:
    System.out.println("Invalid choice.");
  }
 }

 static int menu_a() {

  Scanner in = new Scanner(System.in);

  // print menu
  System.out.println("0. Exit");
  System.out.println("1. Login as test user");
  System.out.println("2. Register");

  // handle user commands
  boolean quit = false;
  int menuItem;
  do {
   System.out.print("Choose menu item: ");

   menuItem = in .nextInt();

   switch (menuItem) {
    case 1:
     System.out.println("You've chosen to Login");
     return 1;

    case 2:
     System.out.println("You've chosen to Register");
     return 2;

    case 0:
     quit = true;
     break;

    default:
     System.out.println("Invalid choice.");
   }
  } while (!quit);

  System.out.println("Sorry to see you go :(");
  return 0;
 }

 static void menu_logged() {

  int menuItem2,menuItem11;
  Scanner in2 = new Scanner(System.in);
  Scanner in3 = new Scanner(System.in);
  System.out.println("What do you want to do?: ");
  System.out.println("1. Drive a car");
  System.out.println("2. Charge a car");
  System.out.println("3. Volunteer");
  ArrayList<car> carlist = new ArrayList<car>();

  for (int i = 0; i < 5; i++) {
    int id = (i+1)*6914 + 16736 + i*150;
    int battery = i*10 + 13 + i*5;
    car cr = new car(id,battery);
    carlist.add(cr);
}
  
  boolean compl = false;
  while (!compl) {

   menuItem2 = in2.nextInt();

   switch (menuItem2) {
    case 1:
    boolean b_selected = false;
     while(!b_selected)
     {
     System.out.println("Which car do you want to drive");
     for (int i = 0; i < 5; i++) {
         System.out.println(i +". Car ID: " + carlist.get(i).getid() + " Battery Percentage: "+ carlist.get(i).getbat() + "%");
     }
     menuItem11 = in2.nextInt();
     if (menuItem11 > 0 && menuItem11 <6){
        carlist.get(menuItem11).startDrive();
        b_selected = true;
        }
    }
    
     break;
    case 2:
     System.out.println("Charge");
     return;
    case 0:
     compl = true;
     return;

    default:
     System.out.println("Invalid choice.");
   }

  }
 }

 static void user_register() {


  Scanner inn = new Scanner(System.in);
  boolean compl = false;
  while (!compl) {
   System.out.println("Please enter your email: ");
   String inputus = inn.nextLine();
   boolean create = us.set_email(inputus);
   if (create) {
    compl = true;
    System.out.println("The email is valid.");
   } else {
    System.out.println("Invalid email form");
   }
  }
  compl = false;

  while (!compl) {
   System.out.println("Please enter your password: ");
   String pas1 = inn.nextLine();
   System.out.println("Please re-enter your password: ");
   String pas2 = inn.nextLine();

   boolean create = us.set_pass(pas1, pas2);
   if (create) {
    compl = true;
    System.out.println("Password setted.");
   } else {
    System.out.println("Invalid password. Please re-enter");
   }
  }
  compl = false;

  while (!compl) {
   System.out.println("Please enter your Full Name: ");
   String name1 = inn.nextLine();

   boolean create = us.set_name(name1);

   if (create) {
    compl = true;
    System.out.println("Name setted.");
   } else {
    System.out.println("No name inserted.");
   }
  }
  compl = false;

  while (!compl) {
   System.out.println("Please enter Driver licence ID: ");
   String idd = inn.nextLine();

   boolean create = us.set_id_drive(idd);

   if (create) {
    compl = true;
    System.out.println("ID setted.");
   } else {
    System.out.println("Invalid ID");
   }
  }

  compl = false;

  while (!compl) {
   System.out.println("Please enter your phone number: ");
   String ph = inn.nextLine();

   boolean create = us.set_phone(ph);

   if (create) {
    compl = true;
    System.out.println("Phone number Valid.");
   } else {
    System.out.println("Invalid Phone number");
   }
  }
  System.out.println("Your account has been created:");
 }

}
