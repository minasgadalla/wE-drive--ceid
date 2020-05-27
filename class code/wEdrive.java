

/**
 * This is the main class which runs, destroys, creates -- its the God
 */
import java.util.Scanner;
public class wEdrive {
 static void main() {
  int user_f_action;
  System.out.println("Hello To wE-drive. Please select from below");
  // show the first menu -- login, register, exit
  user_f_action = menu_a();
  
  switch(user_f_action){
    case 1:
        System.out.println("Please enter phone number");
        System.out.println("Proccessing...");
        System.out.println("Please enter your password");
        System.out.println("Proccessing...");
        System.out.println("Welcome back!!!!!");
        menu_login();
    case 2:
    
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
  
   menuItem2 = in2. nextInt();
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
}
