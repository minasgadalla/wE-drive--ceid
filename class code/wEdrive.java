/**
 * This is the main class which runs, destroys, creates -- its the God
 */

import java.util.Scanner;
public class wEdrive {
 static void main() {
  int user_f_action;
  System.out.println("Hello To wE-drive. Please select from below");
  // show from the first menu -- login, register, exit
  user_f_action = menu_a();

  switch (user_f_action) {
   case 1:
    System.out.println("Please enter phone number");
    System.out.println("Proccessing...");
    System.out.println("Please enter your password");
    System.out.println("Proccessing...");
    System.out.println("Welcome back!!!!!");
    menu_login();
   case 2:
    user_register();    
  }
 }

 static int menu_a() {

  Scanner in = new Scanner(System.in);

  // print menu
  System.out.println("0. Exit");
  System.out.println("1. Login");
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

 static void menu_login() {

  int menuItem2;
  Scanner in2 = new Scanner(System.in);

  System.out.print("Choose menu item: ");
  System.out.println("1. Drive a car");
  System.out.println("2. Charge a car");
  System.out.println("3. Volunteer");

  menuItem2 = in2.nextInt();
  switch (menuItem2) {
   case 1:
    System.out.println("You've chosen to Login");


   case 2:
    System.out.println("You've chosen to Register");

   case 0:
    break;

   default:
    System.out.println("Invalid choice.");
  }

 }
 
 static void user_register(){
     User us = new User();
     
      Scanner inn = new Scanner(System.in);
      boolean compl = false;
      while (!compl){
        System.out.println("Please enter your email: ");
        String inputus = inn.nextLine();
        boolean create = us.set_email(inputus);
        if (create){
            compl = true;
            System.out.println("The email is valid.");
        }else {
            System.out.println("Invalid email form");
        }
      }
      compl = false;
      
        while (!compl){
        System.out.println("Please enter your password: ");
        String pas1 = inn.nextLine();
        System.out.println("Please re-enter your password: ");
        String pas2 = inn.nextLine();
        
        boolean create = us.set_pass(pas1,pas2);
        if (create){
            compl = true;
            System.out.println("Password setted.");
        }else {
            System.out.println("Invalid password. Please re-enter");
        }
      }
      compl = false;
      
      while (!compl){
        System.out.println("Please enter your Full Name: ");
        String name1 = inn.nextLine();
        
        boolean create = us.set_name(name1);
        
        if (create){
            compl = true;
            System.out.println("Name setted.");
        }else {
            System.out.println("No name inserted.");
        }
      }
      compl = false;
      
      while (!compl){
        System.out.println("Please enter Driver licence ID: ");
        String idd = inn.nextLine();
        
        boolean create = us.set_id_drive(idd);
        
        if (create){
            compl = true;
            System.out.println("ID setted.");
        }else {
            System.out.println("Invalid ID");
        }
      }
      
      compl = false;
      
      while (!compl){
        System.out.println("Please enter your phone number: ");
        String ph = inn.nextLine();
        
        boolean create = us.set_phone(ph);
        
        if (create){
            compl = true;
            System.out.println("Phone number Valid.");
        }else {
            System.out.println("Invalid Phone number");
        }
      }
    }
}
